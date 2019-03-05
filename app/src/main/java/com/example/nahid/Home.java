package com.example.nahid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, ten, eleven ,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        one=findViewById(R.id.angry1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oneNext();
            }
        });

        two=findViewById(R.id.angry2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twoNext();
            }
        });

        three=findViewById(R.id.angry3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeNext();
            }
        });

        four=findViewById(R.id.angry4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourNext();
            }
        });

        five=findViewById(R.id.angry5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fiveNext();
            }
        });

        six=findViewById(R.id.angry6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sixeNext();
            }
        });

       seven=findViewById(R.id.angry7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sevenNext();
            }
        });

        eight=findViewById(R.id.angry8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eightnNext();
            }
        });

        nine=findViewById(R.id.angry09);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nineNext();
            }
        });

               ten=findViewById(R.id.angry10);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tenNext();
            }
        });

        eleven=findViewById(R.id.angry11);
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elevenNext();
            }
        });


        me=findViewById(R.id.me);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menNext();
            }
        });





    }

    private void menNext() {
        Intent meobj=new Intent(this, Me.class);
        startActivity(meobj);
    }

    private void elevenNext() {
        Intent elleobj=new Intent(this, Eleven.class);
        startActivity(elleobj);
    }

    private void tenNext() {
        Intent tenobj=new Intent(this, Ten.class);
        startActivity(tenobj);
    }

    private void nineNext() {
        Intent ninej=new Intent(this, Nine.class);
        startActivity(ninej);
    }

    private void eightnNext() {
        Intent eightt=new Intent(this, Eight.class);
        startActivity(eightt);
    }

    private void sevenNext() {
        Intent sevennobj=new Intent(this, Seven.class);
        startActivity(sevennobj);
    }

    private void sixeNext() {
        Intent sixobj=new Intent(this, Six.class);
        startActivity(sixobj);
    }

    private void fiveNext() {
        Intent five=new Intent(this, Five.class);
        startActivity(five);
    }

    private void fourNext() {
        Intent fourobj=new Intent(this, Four.class);
        startActivity(fourobj);

    }


    private void threeNext() {
        Intent threeobj=new Intent(this, Three.class);
        startActivity(threeobj);
    }

    private void twoNext() {
        Intent twoobj=new Intent(this, Two.class);
        startActivity(twoobj);
    }

    private void oneNext() {
        Intent oneeobj=new Intent(this, One.class);
        startActivity(oneeobj);
    }
}
