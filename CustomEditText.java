package rehna.com.customfont;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;

/**
 * Created by rehna.raj on 1/30/2016.
 */
public class CustomEditText extends EditText {
    private int _color;
    private float _size;
    private Typeface _font;

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        setColor(Color.WHITE);
        setHintTextColor(Color.WHITE);
        setTypeface(Typeface.createFromAsset(
                context.getAssets(), "fonts/Roboto-Regular.ttf"));
    }

    public void setColor(int value) {
        this._color = value;
        setTextColor(value);

    }
    public void setHintColor(int value) {
        this._color = value;
        setHintTextColor(value);

    }

    public void setFont(Typeface typeface) {
        this._font = typeface;
        setTypeface(typeface);
    }

    public void setSize(float value) {
        this._size = value;
        setTextSize(TypedValue.COMPLEX_UNIT_PX, value);
    }




}
