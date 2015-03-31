package amb5jb.cs2110.virginia.edu.ghosthunter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by Allison on 3/31/2015.
 */
public class Obstacle extends View {

    int x, y;

    public Obstacle(Context context) {
        super(context);
        x = 0;
        y = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Rect ourRect = new Rect();
        ourRect.set(x, y, canvas.getWidth(), canvas.getHeight());

        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, blue);

        if (x < canvas.getWidth()) {
            x += 10;
        }
        else {
            x = 0;
        }
        if (y < canvas.getHeight()) {
            y += 10;
        }
        else {
            y = 0;
        }

        invalidate();

    }
}
