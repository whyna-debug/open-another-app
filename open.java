Intent zvx = getPackageManager().getLaunchIntentForPackage("com.package");
if (zvx != null) {
 // Start
  startActivity(zvx);
} else {
// not found
	
}
