  // override in specific Activities and return false where you don't want to log Bundles
  open fun canTrackBundle() = true

  override fun onCreate(savedInstanceState: Bundle?) {
      // basic onCreate code here
    
      setCrashLogKeys()
      
      // code that can possibly fail here
  }
  
  private fun setCrashLogKeys() {
    if (!canTrackBundle()) {
      return
    }

    intent?.extras?.let { extras ->
      extras.keySet()?.forEach { key ->
        try {
          val value = extras.get(key)?.toString()
          // note: if the value is null, then Crashlytics will ignore logging it
          Crashlytics.setString(key, value ?: "<null value>")
        } catch (exception: Exception) {
          Timber.e(exception)
        }
      }
    }
  }
