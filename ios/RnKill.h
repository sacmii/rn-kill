
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNRnKillSpec.h"

@interface RnKill : NSObject <NativeRnKillSpec>
#else
#import <React/RCTBridgeModule.h>

@interface RnKill : NSObject <RCTBridgeModule>
#endif

@end
