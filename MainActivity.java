package rehna.com.customfont;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CustomTextview tvCreateAccount,tvSignIn;
    CustomEditText etEmail;
    CustomButton btCancel,btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCreateAccount=(CustomTextview)findViewById(R.id.tv_create_account);
        tvSignIn=(CustomTextview)findViewById(R.id.tv_signup_existinguser_email);
        etEmail=(CustomEditText)findViewById(R.id.et_signup_email);
        btSubmit=(CustomButton)findViewById(R.id.btn_signUp_next);

//        //to change font and color programmatically
       // tvCreateAccount.setTextColor(Color.BLUE);
        tvCreateAccount.setFont(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Bold.ttf"));
        tvSignIn.setFont(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Bold.ttf"));
        tvCreateAccount.setSize(getResources().getDimension(R.dimen.textsize_large));

        //example code to change EditText and buttun color

//        btCancel.setTextColor(Color.BLUE);
//        btCancel.setFont(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf"));
//
//        etEmail.setHintTextColor(Color.BLUE);
//        etEmail.setFont(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Bold.ttf"));
    }
}
