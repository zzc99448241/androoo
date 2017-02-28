
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @Bind(R.id.slidingTab)
    PagerSlidingTab slidingTab;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    private ActionBarDrawerToggle drawerToggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setActionBar();

        initData();

    }

   

   
}
