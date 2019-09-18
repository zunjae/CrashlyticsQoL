# FirebaseQoL
Improve your QoL when using Firebase

## LogKeys

Whenever a crash happens, you often need to know more context to replicate the issue yourself. You can do this by logging the Bundle Key/Values associated with the crashlog by using `Crashlytics.setString`. Implement the following code in your Base Activity https://github.com/zunjae/FirebaseQoL/blob/master/LogKeys.kt so the Bundles of each Activity gets logged.

![Firebase Image](https://cdn.discordapp.com/attachments/341672347746697216/623781775897788416/unknown.png)
