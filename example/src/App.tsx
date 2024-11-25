import * as React from 'react';
import { useColorScheme } from 'react-native';

import { StyleSheet, View, Text } from 'react-native';
import {
  multiply,
  initSession,
} from 'react-native-kotlin-swift-backward-compatible-module';

export default function App() {
  const textColor = useColorScheme() === 'dark' ? 'white' : 'black';
  const [result, setResult] = React.useState<number | undefined>();
  const [initSessionResult, setInitSessionResult] = React.useState<
    string | undefined
  >();
  const isFabric: boolean = !!global?.nativeFabricUIManager;
  const apiKey: string = '472032';
  const sessionId: string =
    '2_MX40NzIwMzJ-fjE3MzI1MDk3MzcyOTZ-ZTQ1bHFGemZEemFhTll2bnd6RnlMSWMxfn5-';
  const token: string =
    'T1==cGFydG5lcl9pZD00NzIwMzImc2lnPThhZGE5MzZhOTc1YThmOWMxMjMwYmMzYzA4ZDdhMDBjYWU3NmU2MDA6c2Vzc2lvbl9pZD0yX01YNDBOekl3TXpKLWZqRTNNekkxTURrM016Y3lPVFotWlRRMWJIRkdlbVpFZW1GaFRsbDJibmQ2Um5sTVNXTXhmbjUtJmNyZWF0ZV90aW1lPTE3MzI1MTgwMTEmbm9uY2U9MC4wMTM0NzY4NDcwNTYyOTYwMzcmcm9sZT1tb2RlcmF0b3ImZXhwaXJlX3RpbWU9MTczNTExMDAwOTQxMSZpbml0aWFsX2xheW91dF9jbGFzc19saXN0PQ==';

  React.useEffect(() => {
    multiply(3, 7).then(setResult);
    initSession(apiKey, sessionId, token)
      .then(setInitSessionResult)
      .catch((e) => console.log(3333, e));
  }, []);

  return (
    <View style={styles.container}>
      <Text
        style={{
          color: textColor,
        }}
      >
        Result: {result}
      </Text>
      <Text
        style={{
          color: textColor,
        }}
      >
        initSession Result: {initSessionResult}
      </Text>
      <Text
        style={{
          color: textColor,
        }}
      >
        is new architecture enabled: {isFabric.toString()}
      </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
