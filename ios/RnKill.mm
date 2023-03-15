#import "RnKill.h"

@implementation RnKill
RCT_EXPORT_MODULE()

// See // https://reactnative.dev/docs/native-modules-ios
RCT_REMAP_METHOD(kill,
    resolver:(RCTPromiseResolveBlock)resolve
    rejecter:(RCTPromiseRejectBlock)reject)
{
    exit(0);
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeRnKillSpecJSI>(params);
}
#endif

@end
