package com.julienvey.android.moncv;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public abstract class GenericActivity extends Activity {

    private static final int MENU_CV_INDEX = 1;
    private static final int MENU_APROPOS_INDEX = 2;
    private static final int MENU_CONTACT_INDEX = 3;

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(0, MENU_CV_INDEX, Menu.NONE, "CV").setIcon(R.drawable.cv);
        menu.add(0, MENU_APROPOS_INDEX, Menu.NONE, "A propos").setIcon(R.drawable.questionmark);
        menu.add(0, MENU_CONTACT_INDEX, Menu.NONE, "Contact").setIcon(R.drawable.contact);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case MENU_CV_INDEX:
                intent = new Intent(this, MonCvMain.class);
                startActivity(intent);
                break;
            case MENU_APROPOS_INDEX:
                intent = new Intent(this, APropos.class);
                startActivity(intent);
                break;
            case MENU_CONTACT_INDEX:
                intent = new Intent(this, Contact.class);
                startActivity(intent);
                break;

            default:
                break;
        }
        return true;
    }
}
