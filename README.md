
# Lifecycle Callback

> Override Lifecycle to Implement multiple behaviors


>`Example - ActivityLog`

```kotlin
interface ActivityLog {

	// Implement Callback to Register
	companion object: ActivityLifecycleRegister {
		val lifecycle = object: ActivityLifecycleCallbacks {
			override fun onResume(activity: Activity) {
				log.i(activity.class.java.simpleName, "onResume()")
			}
	 	}
		
		fun register(activity: out ActivityLifecycleImpl) {
			activity.registerActivityCallback(lifecycle)
		} 	 	
	}
}
```

```kotlin
class MainActivity: LifecycleActivity, ActivityLog {

	// Register all Lifecycle Extensions when implementing them
	override fun registerLifecycleCallback() {
		ActivityLog.register(this)
	}
}
```


## Available Lifecycles:

- `LifecycleActivity` / `LifecycleAppCompatActivity` **~>** `ActivityLifecycleCallbacks`
- `LifecycleFragment` / `LifeCycleFragmentSupport` **~>** `FragmentLifecycleCallbacks`
