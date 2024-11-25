@objc public class KotlinSwiftBackwardCompatibleTurboModuleSwift: NSObject {
    @objc public func multiply(_ a: Double, b: Double, resolve: RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) {
        resolve(a * b)
    }
    @objc public func initSession(_ apiKey: NSString, sessionId: NSString, token: NSString, resolve: RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) {
        /*
        var error: OTError?
        let otSession = OTSession(apiKey: apiKey as String, sessionId: sessionId as String, delegate: self)
        otSession?.connect(withToken: token as String, error: &error)
        // TODO: Handle error
        */
        resolve("foo")
    }
}

/*
extension KotlinSwiftBackwardCompatibleTurboModuleSwift: OTSessionDelegate {
    public func sessionDidConnect(_ session: OTSession) {
        var error: OTError?
        session.signal(withType: "type", string: "data", connection: nil, error: &error)
        // TODO: Handle error

    }

    public func sessionDidDisconnect(_ session: OTSession) {
        //
    }

    public func session(_ session: OTSession, didFailWithError error: OTError) {
        //
    }

    public func session(_ session: OTSession, streamCreated stream: OTStream) {
        //
    }

    public func session(_ session: OTSession, streamDestroyed stream: OTStream) {
        //
    }
}
*/