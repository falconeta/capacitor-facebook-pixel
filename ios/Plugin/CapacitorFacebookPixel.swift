import Foundation
import Cordova
import FBSDKCoreKit
import AppTrackingTransparency

@objc public class CapacitorFacebookPixel: NSObject {
    override init() {
        
        ApplicationDelegate.shared.initializeSDK()
        Settings.shared.isAdvertiserTrackingEnabled = true
        AppEvents.shared.logEvent(AppEvents.Name("battledAnTrue"))
       }
    
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
