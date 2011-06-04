package com.julienvey.android.moncv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends GenericActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        Button telephone = (Button) findViewById(R.id.Telephone);
        Button mail = (Button) findViewById(R.id.Mail);
        Button web = (Button) findViewById(R.id.Web);
        Button twitter = (Button) findViewById(R.id.Twitter);

        telephone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Uri uri = Uri.parse("tel:0675384423");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Uri uri = Uri.parse("mailto://vey.julien@gmail.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Uri uri = Uri.parse("http://www.julienvey.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Uri uri = Uri.parse("http://twitter.com/#!/julienvey");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
