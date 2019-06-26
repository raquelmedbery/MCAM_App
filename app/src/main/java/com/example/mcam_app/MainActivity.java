package com.example.mcam_app;

import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle dToggle;
    private TextView welcomeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer);
        dToggle = new ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close);
        drawer.addDrawerListener(dToggle);
        NavigationView nvDrawer = findViewById(R.id.nvDrawer);
        dToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setUpDrawerContent(nvDrawer);

        welcomeTxt = (TextView) findViewById(R.id.welcomeTxt);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(dToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //used to be public boolean onOptionsItemSelected
    public void selectItemDrawer(MenuItem item) {
        switch(item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragFrame, (new HomeFrag()), "fragment_home").commit();
                welcomeTxt.setText("");
                break;
            case R.id.about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragFrame, (new AboutFrag()), "fragment_about").commit();
                welcomeTxt.setText("");
                break;
            case R.id.link:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragFrame, (new LinkFrag()), "fragment_link").commit();
                welcomeTxt.setText("");
                break;
            case R.id.member:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragFrame, (new MemberFrag()), "fragment_member").commit();
                welcomeTxt.setText("");
                break;

        }
        item.setChecked(true);
        setTitle(item.getTitle());
        drawer.closeDrawers();
    }

    private void setUpDrawerContent(NavigationView navView){
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectItemDrawer(menuItem);
                return true;
            }
        });
    }
}
