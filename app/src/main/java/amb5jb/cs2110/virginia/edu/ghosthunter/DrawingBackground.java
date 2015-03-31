package amb5jb.cs2110.virginia.edu.ghosthunter;

        import android.app.ActionBar;
        import android.app.Activity;
        import android.content.Context;
        import android.content.res.TypedArray;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.graphics.Canvas;
        import android.graphics.Paint;
        import android.util.AttributeSet;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RelativeLayout;

/**
 * Created by Allison on 3/29/2015.
 */
public class DrawingBackground extends View
{
    private Activity act;

    public DrawingBackground(Activity act) {
        super(act);
        this.act = act;
    }

    public View createView() {
        RelativeLayout r = new RelativeLayout(act);

        Button left = new Button(act);
        left.setId(R.id.left_button);
        left.setText("LEFT");
        left.setOnClickListener(new LeftListener());
        r.addView(left);
        RelativeLayout.LayoutParams paramsLeft = (RelativeLayout.LayoutParams)left.getLayoutParams();
        paramsLeft.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        left.setLayoutParams(paramsLeft);

        Button right = new Button(act);
        right.setId(R.id.right_button);
        right.setText("RIGHT");
        r.addView(right);
        RelativeLayout.LayoutParams paramsRight = (RelativeLayout.LayoutParams)right.getLayoutParams();
        paramsRight.addRule(RelativeLayout.RIGHT_OF, R.id.left_button);
        paramsRight.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        Button down = new Button(act);
        down.setId(R.id.down_button);
        down.setText("DOWN");
        r.addView(down);
        RelativeLayout.LayoutParams paramsDown = (RelativeLayout.LayoutParams)down.getLayoutParams();
        paramsDown.addRule(RelativeLayout.RIGHT_OF, R.id.right_button);
        paramsDown.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        Button up = new Button(act);
        up.setId(R.id.up_button);
        up.setText("UP");
        r.addView(up);
        RelativeLayout.LayoutParams paramsUp = (RelativeLayout.LayoutParams)up.getLayoutParams();
        paramsUp.addRule(RelativeLayout.ABOVE, R.id.down_button);
        paramsUp.addRule(RelativeLayout.ALIGN_LEFT, R.id.down_button);

        Button kill = new Button(act);
        kill.setId(R.id.kill_button);
        kill.setText("KILL");
        r.addView(kill);
        RelativeLayout.LayoutParams paramsKill = (RelativeLayout.LayoutParams)kill.getLayoutParams();
        paramsKill.addRule(RelativeLayout.RIGHT_OF, R.id.down_button);
        paramsKill.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        Obstacle o = new Obstacle(this.getContext());
        r.addView(o);
        return r;
    }

    private class LeftListener implements OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}
