package sg.edu.np.mad.mad_prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        User myUser=new User();
        myUser.setName("Javier");
        myUser.setDescription("MAD exe 2");
        myUser.setFollowed(true);
        setContentView(R.layout.activity_main);
        Button myFollow=findViewById(R.id.follow);
        Button myMessage=findViewById(R.id.message);
        TextView myName=findViewById((R.id.name));
        TextView myDesc=findViewById((R.id.description));
        if(myUser.isFollowed()==true){
            myFollow.setText("Unfollow");
        }
        else{myFollow.setText("Follow");}
        myName.setText(myUser.getName());
        myDesc.setText(myUser.getDescription());
        myFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myUser.isFollowed()==true){
                    myUser.setFollowed(false);
                    myFollow.setText("Follow");

                }
                else{myUser.setFollowed(true);
                myFollow.setText("Unfollow");}

            }
        });





    }
}