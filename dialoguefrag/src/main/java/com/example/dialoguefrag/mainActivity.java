package com.example.dialoguefrag;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //telling this activity's function
        //use Actionbar utility methods
        ActionBar actionBar = getSupportActionBar();

        //provoking subtitle for the ActionBar
        actionBar.setTitle(" 6f6 | ActionBar");

        //providing subtitle for the ActionBar
        actionBar.setSubtitle(" Design a custom Action Bar");

        //adding subtitle for the ActionBar
        actionBar.setIcon(R.mipmap.ic_launcher);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
        @Override
         public boolean onCreateOptionsMenu(Menu menu){

            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.search:
                    showAlertDialog();
                    break;
                case R.id.refresh:
                    DialogFragment dialogFragment = new DialogFragment();
                    dialogFragment.show(getSupportFragmentManager(), "My Fragment");
                    break;
                case R.id.copy:
                    Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Alert!")
                            .setMessage("Danger you are falling");
        builder.setPositiveButton("I Know!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}