package suraksha.in.suraksha;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import suraksha.in.fragments.AboutFragment;
import suraksha.in.fragments.CollectionFragment;
import suraksha.in.fragments.CustomerFragment;
import suraksha.in.fragments.SettingsFragment;
import suraksha.in.fragments.TodaySummaryFragment;
import suraksha.in.helpers.ToastHelper;

public class AgentHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_home);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction;
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content_place, new TodaySummaryFragment());
        transaction.commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.agent_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_agent_logout){
            beforeLogout();
            goToLoginActivity();
            ToastHelper.makeToast((ViewGroup) findViewById(R.id.llCustom),getLayoutInflater(),getApplicationContext(),false, "Successfully logged out.");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Method used to change the fragement on the navigation selection
     * @param item
     * @return
     */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.today_summary) {
            FragmentTransaction transaction;
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_place, new TodaySummaryFragment());
            transaction.commit();
            this.setTitle(R.string.title_activity_agent_home);
        } else if (id == R.id.collection) {
            FragmentTransaction transaction;
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_place, new CollectionFragment());
            transaction.commit();
            this.setTitle(R.string.title_activity_collection);
        } else if (id == R.id.customer) {
            FragmentTransaction transaction;
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_place, new CustomerFragment());
            transaction.commit();
            this.setTitle(R.string.title_activity_customer_management);
        } else if (id == R.id.settings) {
            FragmentTransaction transaction;
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_place, new SettingsFragment());
            transaction.commit();
            this.setTitle(R.string.title_activity_settings);
        } else if (id == R.id.about) {
            FragmentTransaction transaction;
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_place, new AboutFragment());
            transaction.commit();
            this.setTitle(R.string.title_activity_about);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void goToLoginActivity() {
        Intent inent = new Intent(this, AgentLoginActivity.class);
        startActivity(inent);
    }

    private void beforeLogout(){

    }

    public void viewCustomer(View view){

        System.out.println("View Customer");
    }

}
