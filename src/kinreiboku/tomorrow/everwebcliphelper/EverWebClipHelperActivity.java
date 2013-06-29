package kinreiboku.tomorrow.everwebcliphelper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class EverWebClipHelperActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = this.getIntent();
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.setClassName("com.studiohitori.everwebclipper", "com.studiohitori.everwebclipper.MainActivity");
		this.startActivity(intent);
		this.finish();
	}
}