package luyong.android.tweetbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 *
 * @author Luo Yong &lt; luo.yong.name@gmail.com &gt;
 */
public class MainActivity extends Activity {
   
   @Override
   public void onCreate(Bundle icicle) {
      super.onCreate(icicle);
      this.setContentView(R.layout.main);
      ListView uiMessageList
              = (ListView)this.findViewById(R.id.uiwidget_message_list);
      uiMessageList.setAdapter(
              new ListItemAdapter(this.getApplicationContext()));

      LayoutInflater layoutInflater
              = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
   }

   public static class ListItemAdapter extends BaseAdapter {

      private Context context;

      public ListItemAdapter(Context context) {
         this.context = context;
      }

      public int getCount() {
         return 20;
      }

      public Object getItem(int arg0) {
         return arg0;
      }

      public long getItemId(int arg0) {
         return arg0;
      }
      public View getView(int arg0, View arg1, ViewGroup arg2) {
         TextView text = new TextView(context);
         text.setText("Hello " + arg0 +".");
         text.setMinHeight(50);
         return text;
      }
   }
}
