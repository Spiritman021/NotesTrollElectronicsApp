package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private CardView drwr;
    private ImageView btn1;
    private BottomSheetDialog bottomSheetDialog;
    private CardView sem1;
    private CardView sem2;
    private CardView sem3;
    private CardView sem4;
    private CardView sem5;
    private CardView sem6;
    private CardView syllabus;
    private ImageView img2;
    private ImageView img;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);

        getSupportActionBar().hide();

        // on syllabus button click

        syllabus = findViewById(R.id.syllabus);

        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1jGMu4K3fcYn_otQmhzIlCKRItE2-MKm6?usp=sharing");
                startActivity(intent);
            }
        });

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutDialog();
            }
        });

        img = findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/file/d/16-JLseMh0WoTVrAH40XnvjSlnqjA-4bF/view?usp=sharing");
                startActivity(intent);

            }
        });

        // syllabus btn ended here

        //on 1st semester button click

        sem1 = findViewById(R.id.sem1);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstPage.class);
                startActivity(intent);
            }
        });

        //1st sem btn ended here

        //on 2nd semester button click

        sem2 = findViewById(R.id.sem2);

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondPage.class);
                startActivity(intent);
            }
        });

        //2nd sem btn ended here

        //on 3rd semester button click

        sem3 = findViewById(R.id.sem3);

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdPage.class);
                startActivity(intent);
            }
        });

        //3rd sem btn ended here

        //on 4th semester button click

        sem4 = findViewById(R.id.sem4);

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FourthPage.class);
                startActivity(intent);
            }
        });

        //4th sem btn ended here

        //on 5th semester button click

        sem5 = findViewById(R.id.sem5);

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FifthPage.class);
                startActivity(intent);
            }
        });

        //5th sem btn ended here

        //on 6th semester button click

        sem6 = findViewById(R.id.sem6);

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SixthPage.class);
                startActivity(intent);
            }
        });

        //6th sem btn ended here

        //btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet_layout,
                        findViewById(R.id.bottom_sheet));

                sheetView.findViewById(R.id.getLink).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Getting",Toast.LENGTH_SHORT).show();
                    }
                });

                sheetView.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });

                // Rate us on click
                sheetView.findViewById(R.id.rate).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Please Rate this app by 5 star", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://play.google.com/store/apps/details?id=com.tworoot2.notestrollelectronics"));
                        startActivity(i);
                    }
                });

                // Share on click
                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        String share = "Download Notes Troll Electronics App\n"
                                .concat("Study Materials for B.Sc. Electronics Hons. \n\n")
                                .concat("Download Now\n\nhttps://play.google.com/store/apps/details?id=com.tworoot2.notestrollelectronics");
                        Intent i = new Intent(android.content.Intent.ACTION_SEND);
                        i.setType("text/plain");
                        i.putExtra(android.content.Intent.EXTRA_TEXT, share);
                        startActivity(Intent.createChooser(i,"Notes Troll Electronics App Share using"));
                    }
                });

                // Report on click
                sheetView.findViewById(R.id.report).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String emailsubject = "Facing a problem";
                        String emailbody =
                                "Enter your problem : " + " " + "\n"+ "\n"+ "\n"+
                                        "SERIAL: " + Build.SERIAL + "\n" +
                                        "MODEL: " + Build.MODEL + "\n" +
                                        "ID: " + Build.ID + "\n" +
                                        "Manufacture: " + Build.MANUFACTURER + "\n" +
                                        "brand: " + Build.BRAND + "\n" +
                                        "type: " + Build.TYPE + "\n" +
                                        "user: " +Build.USER + "\n" +
                                        "BASE: " + Build.VERSION_CODES.BASE + "\n" +
                                        "INCREMENTAL " + Build.VERSION.INCREMENTAL + "\n" +
                                        "SDK  " + Build.VERSION.SDK + "\n" +
                                        "BOARD: " + Build.BOARD + "\n" +
                                        "BRAND " + Build.BRAND + "\n" +
                                        "HOST " + Build.HOST + "\n" +
                                        "FINGERPRINT: " + Build.FINGERPRINT + "\n" +
                                        "Version Code: " + Build.VERSION.RELEASE;
                        bottomSheetDialog.dismiss();
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(emailsubject) + "&body=" + Uri.encode(emailbody)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
                        mail.putExtra(Intent.EXTRA_TEXT, emailbody);
                        startActivity(mail);

                    }
                });

                // About us on click
                sheetView.findViewById(R.id.about).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        openAboutDialog();

                        bottomSheetDialog.dismiss();
                    }
                });

                // Contact us on click
                sheetView.findViewById(R.id.contact).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        String esubject = "Contacting........";
                        String ebody = "Hello my self .....";
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(esubject) + "&body=" + Uri.encode(ebody)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, esubject);
                        mail.putExtra(Intent.EXTRA_TEXT, ebody);
                        startActivity(mail);
                    }
                });

                // Upload on click
                sheetView.findViewById(R.id.upload).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        bottomSheetDialog.dismiss();
                        String subject = "STUDY MATERIALS";
                        String body = "I want to send some study materials";
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(subject) + "&body=" + Uri.encode(body)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, subject);
                        mail.putExtra(Intent.EXTRA_TEXT, body);
                        startActivity(mail);
                    }
                });



                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
                //bottomSheetDialog.dismiss();
            }
        });

        //drawer opens
        drwr = findViewById(R.id.drwr);


        drwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet_layout,
                        findViewById(R.id.bottom_sheet));

                sheetView.findViewById(R.id.getLink).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Getting",Toast.LENGTH_SHORT).show();
                    }
                });

                sheetView.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });

                // Rate us on click
                sheetView.findViewById(R.id.rate).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Please Rate this app by 5 star", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://play.google.com/store/apps/details?id=com.tworoot2.notestrollelectronics"));
                        startActivity(i);
                    }
                });

                // Share on click
                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        String share = "Download Notes Troll Electronics App\n"
                                .concat("Study Materials for B.Sc. Electronics Hons. \n\n")
                                .concat("Download Now\n\nhttps://play.google.com/store/apps/details?id=com.tworoot2.notestrollelectronics");
                        Intent i = new Intent(android.content.Intent.ACTION_SEND);
                        i.setType("text/plain");
                        i.putExtra(android.content.Intent.EXTRA_TEXT, share);
                        startActivity(Intent.createChooser(i,"Notes Troll Electronics App Share using"));
                    }
                });

                // Report on click
                sheetView.findViewById(R.id.report).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String emailsubject = "Facing a problem";
                        String emailbody =
                                "Enter your problem : " + " " + "\n"+ "\n"+ "\n"+
                                "SERIAL: " + Build.SERIAL + "\n" +
                                "MODEL: " + Build.MODEL + "\n" +
                                "ID: " + Build.ID + "\n" +
                                "Manufacture: " + Build.MANUFACTURER + "\n" +
                                "brand: " + Build.BRAND + "\n" +
                                "type: " + Build.TYPE + "\n" +
                                "user: " +Build.USER + "\n" +
                                "BASE: " + Build.VERSION_CODES.BASE + "\n" +
                                "INCREMENTAL " + Build.VERSION.INCREMENTAL + "\n" +
                                "SDK  " + Build.VERSION.SDK + "\n" +
                                "BOARD: " + Build.BOARD + "\n" +
                                "BRAND " + Build.BRAND + "\n" +
                                "HOST " + Build.HOST + "\n" +
                                "FINGERPRINT: " + Build.FINGERPRINT + "\n" +
                                "Version Code: " + Build.VERSION.RELEASE;
                        bottomSheetDialog.dismiss();
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(emailsubject) + "&body=" + Uri.encode(emailbody)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
                        mail.putExtra(Intent.EXTRA_TEXT, emailbody);
                        startActivity(mail);

                    }
                });

                // About us on click
                sheetView.findViewById(R.id.about).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        openAboutDialog();

                        bottomSheetDialog.dismiss();
                    }
                });

                // Contact us on click
                sheetView.findViewById(R.id.contact).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        String esubject = "Contacting........";
                        String ebody = "Hello my self .....";
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(esubject) + "&body=" + Uri.encode(ebody)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, esubject);
                        mail.putExtra(Intent.EXTRA_TEXT, ebody);
                        startActivity(mail);
                    }
                });

                // Upload on click
                sheetView.findViewById(R.id.upload).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                        bottomSheetDialog.dismiss();
                        String subject = "STUDY MATERIALS";
                        String body = "I want to send some study materials";
                        Intent mail = new Intent(Intent.ACTION_SENDTO);
                        mail.setAction(Intent.ACTION_VIEW);
                        mail.setData(Uri.parse("mailto:notestroll@gmail.com"+ "?subject="
                                + Uri.encode(subject) + "&body=" + Uri.encode(body)));
                        mail.putExtra(Intent.EXTRA_SUBJECT, subject);
                        mail.putExtra(Intent.EXTRA_TEXT, body);
                        startActivity(mail);
                    }
                });



                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
                //bottomSheetDialog.dismiss();
            }
        });

    }

    private void openAboutDialog() {
        dialog.setContentView(R.layout.about_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);

        ImageView btn123 = dialog.findViewById(R.id.btn123);
        TextView text1 = dialog.findViewById(R.id.text1);
        TextView text2 = dialog.findViewById(R.id.text2);
        CardView notestroll = dialog.findViewById(R.id.notestroll);

        notestroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://play.google.com/store/apps/details?id=com.my.notestroll"));
                startActivity(i);
            }
        });

        text2.setText("Notes Troll Delhi University Application provides study materials to all delhi university students");

        text1.setText("This Application is a part of Notes Troll Delhi University Application. " +
                "This Application Provides Study Materials to B.Sc. H. Electronics Delhi University Students" );

        btn123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        dialog.show();
    }
}