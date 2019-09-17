# CrashlyticsQoL
Improve your QoL when using Crashlytics

## LogKeys

Whenever a crash happens, you often need to know more context to replicate the issue yourself. You can do this by logging the Bundle Key/Values associated with the crashlog by using `Crashlytics.setString`. Implement the following code in your Base Activity https://github.com/zunjae/CrashlyticsQoL/blob/master/LogKeys.kt so the Bundles of each Activity gets logged.
