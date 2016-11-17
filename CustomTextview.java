package rehna.com.customfont;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/**
 * Created by rehna.raj on 1/29/2016.
 */
public class CustomTextview  extends TextView {
    private  int _color;
    private  float _size;
    private Typeface _font;
    private String firstText;
    public CustomTextview(Context context, AttributeSet attrs) {
        super(context, attrs);

        setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.textsize));
        setTextColor(Color.WHITE);
        setTypeface(Typeface.createFromAsset(
                context.getAssets(), "fonts/Roboto-Regular.ttf"));

        //this.firstText = attrs.getAttributeValue("http://schemas.android.com/apk/res/ org.cru.voke", "first_name");
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
