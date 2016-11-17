package rehna.com.customfont;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;

/**
 * Created by rehna.raj on 1/30/2016.
 */
public class CustomButton extends Button {
    private  int _color;
    private  float _size;
    private Typeface _font;
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.button_text_size));
        setTextColor(Color.WHITE);
        setTypeface(Typeface.createFromAsset(
                context.getAssets(), "fonts/Roboto-Bold.ttf"));

    }
    public void setColor(int value){
        this._color = value;
        setTextColor(value);

    }
    public void setFont(Typeface typeface) {
        this._font = typeface;
        setTypeface(typeface);
    }

    public void setSize(float value) {
        this._size = value;
        setTextSize(TypedValue.COMPLEX_UNIT_PX,value);
    }
}
