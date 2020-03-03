package com.example.desafiocamara;

import android.view.View;
import android.view.View.OnClickListener;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements OnClickListener
        private Magicalpermission magicalpermission;
        <private static int REZICE_PHOTO_PIXEL;
        private final static int PORCENTAGE = 50%;
        private MagicalCamera magicalCamera;

        public MainActivity(Magicalpermission magicalpermission, MagicalCamera magicalCamera, imageView imageViewPhoto) {
            this.magicalpermission = magicalpermission;
            this.magicalCamera = magicalCamera;
        }
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.Id.buttonfoto).setOnClikListener(This);
        imageViewPhoto = findViewById(R.Id imageViewPhoto)

        String[] permissions = new String []{
        Manifest.permissions.Camera,
        Manifest.permissions.WRITE.EXTERNAL.STORAGE,
        Manifest.permissions.READ.EXTERNAL.STORAGE,
        };

        magicalPermissions = MagicalPermissions(activity:this, permissions);
        magicalCamera = new MagicalCamera (activity:this, RESIZE_PHOTO,PIXEL,PERCENTAGE, magical permissions);

        }

    }
}
