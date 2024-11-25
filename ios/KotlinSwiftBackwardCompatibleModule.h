
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNKotlinSwiftBackwardCompatibleModuleSpec.h"

@interface KotlinSwiftBackwardCompatibleModule : NSObject <NativeKotlinSwiftBackwardCompatibleModuleSpec>
#else
#import <React/RCTBridgeModule.h>
#import <OpenTok/OpenTok.h>

// @interface KotlinSwiftBackwardCompatibleModule : NSObject <RCTBridgeModule, OTSessionDelegate>
@interface KotlinSwiftBackwardCompatibleModule : NSObject <RCTBridgeModule>
#endif

@end
