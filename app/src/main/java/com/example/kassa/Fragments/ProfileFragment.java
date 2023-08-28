package com.example.kassa.Fragments;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.kassa.Coin.BountyLargeC;
import com.example.kassa.Coin.BountyMediumC;
import com.example.kassa.Coin.BountySmallC;
import com.example.kassa.Coin.Coins;
import com.example.kassa.Coin.Coo;
import com.example.kassa.Coin.Coos;
import com.example.kassa.Coin.DuploLargeC;
import com.example.kassa.Coin.DuploMediumC;
import com.example.kassa.Coin.DuploSmallC;
import com.example.kassa.Coin.KinderLargeC;
import com.example.kassa.Coin.KinderMediumC;
import com.example.kassa.Coin.KinderSmallC;
import com.example.kassa.Coin.KitKatLargeC;
import com.example.kassa.Coin.KitKatMediumC;
import com.example.kassa.Coin.KitKatSmallC;
import com.example.kassa.Coin.MaltLargeC;
import com.example.kassa.Coin.MaltMediumC;
import com.example.kassa.Coin.MaltSmallC;
import com.example.kassa.Coin.MarsLargeC;
import com.example.kassa.Coin.MarsMediumC;
import com.example.kassa.Coin.MarsSmallC;
import com.example.kassa.Coin.MilkaLargeC;
import com.example.kassa.Coin.MilkaMediumC;
import com.example.kassa.Coin.MilkaSmallC;
import com.example.kassa.Coin.MmzLargeC;
import com.example.kassa.Coin.MmzMediumC;
import com.example.kassa.Coin.MmzSmallC;
import com.example.kassa.Coin.OreoLargeC;
import com.example.kassa.Coin.OreoMediumC;
import com.example.kassa.Coin.OreoSmallC;
import com.example.kassa.Coin.RafLargeC;
import com.example.kassa.Coin.RafMediumC;
import com.example.kassa.Coin.RafSmallC;
import com.example.kassa.Coin.SnekresLargeC;
import com.example.kassa.Coin.SnekresMediuomC;
import com.example.kassa.Coin.SnekresSmallC;
import com.example.kassa.Coin.TwixLargeC;
import com.example.kassa.Coin.TwixMediumC;
import com.example.kassa.Coin.TwixSmallC;
import com.example.kassa.Model.User;
import com.example.kassa.R;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.app.Activity.RESULT_OK;

public class ProfileFragment extends Fragment
{
    CircleImageView image_profile;
    TextView username;

    DatabaseReference reference;
    FirebaseUser fuser;

    StorageReference storageReference;
    private static final int IMAGE_REQUEST =1;
    private Uri imageUri;
    private StorageTask uploadTask;

    Button ferrerol_submit;
    Button ferrerom_submit;
    Button ferreros_submit;
    Button kinderl_submit;
    Button kinderm_submit;
    Button kinders_submit;
    Button snekresl_submit;
    Button snekresm_submit;
    Button snekress_submit;
    Button twixl_submit;
    Button twixm_submit;
    Button twixs_submit;
    Button rafl_submit;
    Button rafm_submit;
    Button rafs_submit;
    Button oreol_submit;
    Button oreom_submit;
    Button oreos_submit;
    Button milkal_submit;
    Button milkam_submit;
    Button milkas_submit;
    Button marsl_submit;
    Button marsm_submit;
    Button marss_submit;
    Button maltl_submit;
    Button maltm_submit;
    Button malts_submit;
    Button kitkatl_submit;
    Button kitkatm_submit;
    Button kitkats_submit;
    Button mmzl_submit;
    Button mmzm_submit;
    Button mmzs_submit;
    Button duplol_submit;
    Button duplom_submit;
    Button duplos_submit;
    Button bountyl_submit;
    Button bountym_submit;
    Button bountys_submit;

    EditText ferrerol;
    EditText ferrerom;
    EditText ferreros;
    EditText kinderl;
    EditText kinderm;
    EditText kinders;
    EditText snekresl;
    EditText snekresm;
    EditText snekress;
    EditText twixl;
    EditText twixm;
    EditText twixs;
    EditText rafl;
    EditText rafm;
    EditText rafs;
    EditText oreol;
    EditText oreom;
    EditText oreos;
    EditText milkal;
    EditText milkam;
    EditText milkas;
    EditText marsl;
    EditText marsm;
    EditText marss;
    EditText maltl;
    EditText maltm;
    EditText malts;
    EditText kitkatl;
    EditText kitkatm;
    EditText kitkats;
    EditText mmzl;
    EditText mmzm;
    EditText mmzs;
    EditText duplol;
    EditText duplom;
    EditText duplos;
    EditText bountyl;
    EditText bountym;
    EditText bountys;

    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    TextView m;

    LinearLayout aa;
    LinearLayout bb;
    LinearLayout cc;
    LinearLayout dd;
    LinearLayout ee;
    LinearLayout ff;
    LinearLayout gg;
    LinearLayout hh;
    LinearLayout ii;
    LinearLayout jj;
    LinearLayout kk;
    LinearLayout ll;
    LinearLayout mm;

    DatabaseReference ferreroxl;
    DatabaseReference ferreroxm;
    DatabaseReference ferreroxs;
    DatabaseReference kinderxl;
    DatabaseReference kinderxm;
    DatabaseReference kinderxs;
    DatabaseReference snekresxl;
    DatabaseReference snekresxm;
    DatabaseReference snekresxs;
    DatabaseReference twixxl;
    DatabaseReference twixxm;
    DatabaseReference twixxs;
    DatabaseReference rafxl;
    DatabaseReference rafxm;
    DatabaseReference rafxs;
    DatabaseReference oreoxl;
    DatabaseReference oreoxm;
    DatabaseReference oreoxs;
    DatabaseReference milkaxl;
    DatabaseReference milkaxm;
    DatabaseReference milkaxs;
    DatabaseReference marsxl;
    DatabaseReference marsxm;
    DatabaseReference marsxs;
    DatabaseReference maltxl;
    DatabaseReference maltxm;
    DatabaseReference maltxs;
    DatabaseReference kitkatxl;
    DatabaseReference kitkatxm;
    DatabaseReference kitkatxs;
    DatabaseReference mmzxl;
    DatabaseReference mmzxm;
    DatabaseReference mmzxs;
    DatabaseReference duploxl;
    DatabaseReference duploxm;
    DatabaseReference duploxs;
    DatabaseReference bountyxl;
    DatabaseReference bountyxm;
    DatabaseReference bountyxs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ferrerol_submit = view.findViewById(R.id.ferrerol_submit);
        ferrerom_submit = view.findViewById(R.id.ferrerom_submit);
        ferreros_submit = view.findViewById(R.id.ferreros_submit);
        kinderl_submit = view.findViewById(R.id.kinderl_submit);
        kinderm_submit = view.findViewById(R.id.kinderm_submit);
        kinders_submit = view.findViewById(R.id.kinders_submit);
        snekresl_submit = view.findViewById(R.id.snekresl_submit);
        snekresm_submit = view.findViewById(R.id.snekresm_submit);
        snekress_submit = view.findViewById(R.id.snekress_submit);
        twixl_submit = view.findViewById(R.id.twixl_submit);
        twixm_submit = view.findViewById(R.id.twixm_submit);
        twixs_submit = view.findViewById(R.id.twixs_submit);
        rafl_submit = view.findViewById(R.id.rafl_submit);
        rafm_submit = view.findViewById(R.id.rafm_submit);
        rafs_submit = view.findViewById(R.id.rafs_submit);
        oreol_submit = view.findViewById(R.id.oreol_submit);
        oreom_submit = view.findViewById(R.id.oreom_submit);
        oreos_submit = view.findViewById(R.id.oreos_submit);
        milkal_submit = view.findViewById(R.id.milkal_submit);
        milkam_submit = view.findViewById(R.id.milkam_submit);
        milkas_submit = view.findViewById(R.id.milkas_submit);
        marsl_submit = view.findViewById(R.id.marsl_submit);
        marsm_submit = view.findViewById(R.id.marsm_submit);
        marss_submit = view.findViewById(R.id.marss_submit);
        maltl_submit = view.findViewById(R.id.maltl_submit);
        maltm_submit = view.findViewById(R.id.maltm_submit);
        malts_submit = view.findViewById(R.id.malts_submit);
        kitkatl_submit = view.findViewById(R.id.kitkatl_submit);
        kitkatm_submit = view.findViewById(R.id.kitkatm_submit);
        kitkats_submit = view.findViewById(R.id.kitkats_submit);
        mmzl_submit = view.findViewById(R.id.mmzl_submit);
        mmzm_submit = view.findViewById(R.id.mmzm_submit);
        mmzs_submit = view.findViewById(R.id.mmzs_submit);
        duplol_submit = view.findViewById(R.id.duplol_submit);
        duplom_submit = view.findViewById(R.id.duplom_submit);
        duplos_submit = view.findViewById(R.id.duplos_submit);
        bountyl_submit = view.findViewById(R.id.bountyl_submit);
        bountym_submit = view.findViewById(R.id.bountym_submit);
        bountys_submit = view.findViewById(R.id.bountys_submit);

        ferrerol = view.findViewById(R.id.ferrerol);
        ferrerom = view.findViewById(R.id.ferrerom);
        ferreros = view.findViewById(R.id.ferreros);
        kinderl = view.findViewById(R.id.kinderl);
        kinderm = view.findViewById(R.id.kinderm);
        kinders = view.findViewById(R.id.kinders);
        snekresl = view.findViewById(R.id.snekresl);
        snekresm = view.findViewById(R.id.snekresm);
        snekress = view.findViewById(R.id.snekress);
        twixl = view.findViewById(R.id.twixl);
        twixm = view.findViewById(R.id.twixm);
        twixs = view.findViewById(R.id.twixs);
        rafl = view.findViewById(R.id.rafl);
        rafm = view.findViewById(R.id.rafm);
        rafs = view.findViewById(R.id.rafs);
        oreol = view.findViewById(R.id.oreol);
        oreom = view.findViewById(R.id.oreom);
        oreos = view.findViewById(R.id.oreos);
        milkal = view.findViewById(R.id.milkal);
        milkam = view.findViewById(R.id.milkam);
        milkas = view.findViewById(R.id.milkas);
        marsl = view.findViewById(R.id.marsl);
        marsm = view.findViewById(R.id.marsm);
        marss = view.findViewById(R.id.marss);
        maltl = view.findViewById(R.id.maltl);
        maltm = view.findViewById(R.id.maltm);
        malts = view.findViewById(R.id.malts);
        kitkatl = view.findViewById(R.id.kitkatl);
        kitkatm = view.findViewById(R.id.kitkatm);
        kitkats = view.findViewById(R.id.kitkats);
        mmzl = view.findViewById(R.id.mmzl);
        mmzm = view.findViewById(R.id.mmzm);
        mmzs = view.findViewById(R.id.mmzs);
        duplol = view.findViewById(R.id.duplol);
        duplom = view.findViewById(R.id.duplom);
        duplos = view.findViewById(R.id.duplos);
        bountyl = view.findViewById(R.id.bountyl);
        bountym = view.findViewById(R.id.bountym);
        bountys = view.findViewById(R.id.bountys);

        a = view.findViewById(R.id.a);
        b = view.findViewById(R.id.b);
        c = view.findViewById(R.id.c);
        d = view.findViewById(R.id.d);
        e = view.findViewById(R.id.e);
        f = view.findViewById(R.id.f);
        g = view.findViewById(R.id.g);
        h = view.findViewById(R.id.h);
        i = view.findViewById(R.id.i);
        j = view.findViewById(R.id.j);
        k = view.findViewById(R.id.k);
        l = view.findViewById(R.id.l);
        m = view.findViewById(R.id.m);

        aa = view.findViewById(R.id.aa);
        bb = view.findViewById(R.id.bb);
        cc = view.findViewById(R.id.cc);
        dd = view.findViewById(R.id.dd);
        ee = view.findViewById(R.id.ee);
        ff = view.findViewById(R.id.ff);
        gg = view.findViewById(R.id.gg);
        hh = view.findViewById(R.id.hh);
        ii = view.findViewById(R.id.ii);
        jj = view.findViewById(R.id.jj);
        kk = view.findViewById(R.id.kk);
        ll = view.findViewById(R.id.ll);
        mm = view.findViewById(R.id.mm);

        aa.setVisibility(View.GONE);
        bb.setVisibility(View.GONE);
        cc.setVisibility(View.GONE);
        dd.setVisibility(View.GONE);
        ee.setVisibility(View.GONE);
        ff.setVisibility(View.GONE);
        gg.setVisibility(View.GONE);
        hh.setVisibility(View.GONE);
        ii.setVisibility(View.GONE);
        jj.setVisibility(View.GONE);
        kk.setVisibility(View.GONE);
        ll.setVisibility(View.GONE);
        mm.setVisibility(View.GONE);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (aa.getVisibility() == View.GONE)
                {
                    aa.setVisibility(View.VISIBLE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }
                else if (aa.getVisibility() == View.VISIBLE)
                {
                    aa.setVisibility(View.GONE);
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (bb.getVisibility() == View.GONE) {
                    bb.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (bb.getVisibility() == View.VISIBLE) {
                    bb.setVisibility(View.GONE);
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (cc.getVisibility() == View.GONE) {
                    cc.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (cc.getVisibility() == View.VISIBLE) {
                    cc.setVisibility(View.GONE);
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (dd.getVisibility() == View.GONE) {
                    dd.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (dd.getVisibility() == View.VISIBLE) {
                    dd.setVisibility(View.GONE);
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ee.getVisibility() == View.GONE) {
                    ee.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (ee.getVisibility() == View.VISIBLE) {
                    ee.setVisibility(View.GONE);
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ff.getVisibility() == View.GONE) {
                    ff.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (ff.getVisibility() == View.VISIBLE) {
                    ff.setVisibility(View.GONE);
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (gg.getVisibility() == View.GONE) {
                    gg.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (gg.getVisibility() == View.VISIBLE) {
                    gg.setVisibility(View.GONE);
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (hh.getVisibility() == View.GONE) {
                    hh.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (hh.getVisibility() == View.VISIBLE) {
                    hh.setVisibility(View.GONE);
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ii.getVisibility() == View.GONE) {
                    ii.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (ii.getVisibility() == View.VISIBLE) {
                    ii.setVisibility(View.GONE);
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (jj.getVisibility() == View.GONE) {
                    jj.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (jj.getVisibility() == View.VISIBLE) {
                    jj.setVisibility(View.GONE);
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (kk.getVisibility() == View.GONE) {
                    kk.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (kk.getVisibility() == View.VISIBLE) {
                    kk.setVisibility(View.GONE);
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ll.getVisibility() == View.GONE) {
                    ll.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    mm.setVisibility(View.GONE);
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (ll.getVisibility() == View.VISIBLE) {
                    ll.setVisibility(View.GONE);
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mm.getVisibility() == View.GONE) {
                    mm.setVisibility(View.VISIBLE);
                    aa.setVisibility(View.GONE);
                    bb.setVisibility(View.GONE);
                    cc.setVisibility(View.GONE);
                    dd.setVisibility(View.GONE);
                    ee.setVisibility(View.GONE);
                    ff.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    hh.setVisibility(View.GONE);
                    ii.setVisibility(View.GONE);
                    jj.setVisibility(View.GONE);
                    kk.setVisibility(View.GONE);
                    ll.setVisibility(View.GONE);
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.green));
                    a.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    b.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    c.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    d.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    e.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    f.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    g.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    h.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    i.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    j.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    k.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                    l.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                } else if (mm.getVisibility() == View.VISIBLE) {
                    mm.setVisibility(View.GONE);
                    m.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.red));
                }

            }
        });

        image_profile = view.findViewById(R.id.profile_image);
        username = view.findViewById(R.id.username);

        storageReference = FirebaseStorage.getInstance().getReference("uploads");

        fuser = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users").child(fuser.getUid());

        ferreroxl = FirebaseDatabase.getInstance().getReference("Coins").child("Ferrero").child("FerreroL");
        ferreroxm = FirebaseDatabase.getInstance().getReference("Coins").child("Ferrero").child("FerreroM");
        ferreroxs = FirebaseDatabase.getInstance().getReference("Coins").child("Ferrero").child("FerreroS");
        kinderxl = FirebaseDatabase.getInstance().getReference("Coins").child("Kinder").child("KinderL");
        kinderxm = FirebaseDatabase.getInstance().getReference("Coins").child("Kinder").child("KinderM");
        kinderxs = FirebaseDatabase.getInstance().getReference("Coins").child("Kinder").child("KinderS");
        snekresxl = FirebaseDatabase.getInstance().getReference("Coins").child("Snekres").child("SnekresL");
        snekresxm = FirebaseDatabase.getInstance().getReference("Coins").child("Snekres").child("SnekresM");
        snekresxs = FirebaseDatabase.getInstance().getReference("Coins").child("Snekres").child("SnekresS");
        twixxl = FirebaseDatabase.getInstance().getReference("Coins").child("Twix").child("TwixL");
        twixxm = FirebaseDatabase.getInstance().getReference("Coins").child("Twix").child("TwixM");
        twixxs = FirebaseDatabase.getInstance().getReference("Coins").child("Twix").child("TwixS");
        rafxl = FirebaseDatabase.getInstance().getReference("Coins").child("Raffaello").child("RaffaelloL");
        rafxm = FirebaseDatabase.getInstance().getReference("Coins").child("Raffaello").child("RaffaelloM");
        rafxs = FirebaseDatabase.getInstance().getReference("Coins").child("Raffaello").child("RaffaelloS");
        oreoxl = FirebaseDatabase.getInstance().getReference("Coins").child("Oreo").child("OreoL");
        oreoxm = FirebaseDatabase.getInstance().getReference("Coins").child("Oreo").child("OreoM");
        oreoxs = FirebaseDatabase.getInstance().getReference("Coins").child("Oreo").child("OreoS");
        milkaxl = FirebaseDatabase.getInstance().getReference("Coins").child("Milka").child("MilkaL");
        milkaxm = FirebaseDatabase.getInstance().getReference("Coins").child("Milka").child("MilkaM");
        milkaxs = FirebaseDatabase.getInstance().getReference("Coins").child("Milka").child("MilkaS");
        marsxl = FirebaseDatabase.getInstance().getReference("Coins").child("Mars").child("MarsL");
        marsxm = FirebaseDatabase.getInstance().getReference("Coins").child("Mars").child("MarsM");
        marsxs = FirebaseDatabase.getInstance().getReference("Coins").child("Mars").child("MarsS");
        maltxl = FirebaseDatabase.getInstance().getReference("Coins").child("Maltesers").child("MaltesersL");
        maltxm = FirebaseDatabase.getInstance().getReference("Coins").child("Maltesers").child("MaltesersM");
        maltxs = FirebaseDatabase.getInstance().getReference("Coins").child("Maltesers").child("MaltesersS");
        kitkatxl = FirebaseDatabase.getInstance().getReference("Coins").child("KitKat").child("KitKatL");
        kitkatxm = FirebaseDatabase.getInstance().getReference("Coins").child("KitKat").child("KitKatM");
        kitkatxs = FirebaseDatabase.getInstance().getReference("Coins").child("KitKat").child("KitKatS");
        mmzxl = FirebaseDatabase.getInstance().getReference("Coins").child("M&M'S").child("M&M'SL");
        mmzxm = FirebaseDatabase.getInstance().getReference("Coins").child("M&M'S").child("M&M'SM");
        mmzxs = FirebaseDatabase.getInstance().getReference("Coins").child("M&M'S").child("M&M'SS");
        duploxl = FirebaseDatabase.getInstance().getReference("Coins").child("Duplo").child("DuploL");
        duploxm = FirebaseDatabase.getInstance().getReference("Coins").child("Duplo").child("DuploM");
        duploxs = FirebaseDatabase.getInstance().getReference("Coins").child("Duplo").child("DuploS");
        bountyxl = FirebaseDatabase.getInstance().getReference("Coins").child("Bounty").child("BountyL");
        bountyxm = FirebaseDatabase.getInstance().getReference("Coins").child("Bounty").child("BountyM");
        bountyxs = FirebaseDatabase.getInstance().getReference("Coins").child("Bounty").child("BountyS");

        ferrerol_submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (TextUtils.isEmpty(ferrerol.getText().toString()))
                {
                    Toast.makeText(getActivity(), "gg", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double ferrero_xlarge = Double.parseDouble(ferrerol.getText().toString());
                    updateFerreroXl(ferrero_xlarge);
                    Toast.makeText(getActivity(), "فيريررو كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ferrerom_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(ferrerom.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double ferrero_xmedium = Double.parseDouble(ferrerom.getText().toString());
                    updateFerreroXM(ferrero_xmedium);
                    Toast.makeText(getActivity(), "فيريررو متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ferreros_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(ferreros.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double ferrero_xsmall = Double.parseDouble(ferreros.getText().toString());
                    updateFerreroXS(ferrero_xsmall);
                    Toast.makeText(getActivity(), "فيريررو صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kinderl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kinderl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kinder_xlarge = Double.parseDouble(kinderl.getText().toString());
                    updateKinderXl(kinder_xlarge);
                    Toast.makeText(getActivity(), "كندر كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kinderm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kinderm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kinder_xmedium = Double.parseDouble(kinderm.getText().toString());
                    updateKinderXM(kinder_xmedium);
                    Toast.makeText(getActivity(), "كندر متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kinders_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kinders.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kinder_xsmall = Double.parseDouble(kinders.getText().toString());
                    updateKinderXS(kinder_xsmall);
                    Toast.makeText(getActivity(), "كندر صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        snekresl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(snekresl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double snekres_xlarge = Double.parseDouble(snekresl.getText().toString());
                    updatesnekresXl(snekres_xlarge);
                    Toast.makeText(getActivity(), "سنكرز كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        snekresm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(snekresm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double snekres_xmedium = Double.parseDouble(snekresm.getText().toString());
                    updatesnekresXM(snekres_xmedium);
                    Toast.makeText(getActivity(), "سنكرز متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        snekress_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(snekress.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double snekres_xsmall = Double.parseDouble(snekress.getText().toString());
                    updatesnekresXS(snekres_xsmall);
                    Toast.makeText(getActivity(), "سنكرز صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        twixl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(twixl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double twix_xlarge = Double.parseDouble(twixl.getText().toString());
                    updatetwixXl(twix_xlarge);
                    Toast.makeText(getActivity(), "تويكس كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        twixm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(twixm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double twix_xmedium = Double.parseDouble(twixm.getText().toString());
                    updatetwixXM(twix_xmedium);
                    Toast.makeText(getActivity(), "تويكس متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        twixs_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(twixs.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double twix_xsmall = Double.parseDouble(twixs.getText().toString());
                    updatetwixXS(twix_xsmall);
                    Toast.makeText(getActivity(), "تويكس صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rafl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(rafl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double raf_xlarge = Double.parseDouble(rafl.getText().toString());
                    updaterafXl(raf_xlarge);
                    Toast.makeText(getActivity(), "رافاييلو كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rafm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(rafm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double raf_xmedium = Double.parseDouble(rafm.getText().toString());
                    updaterafXM(raf_xmedium);
                    Toast.makeText(getActivity(), "رافاييلو متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rafs_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(rafs.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double raf_xsmall = Double.parseDouble(rafs.getText().toString());
                    updaterafXS(raf_xsmall);
                    Toast.makeText(getActivity(), "رافاييلو صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        oreol_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(oreol.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double oreo_xlarge = Double.parseDouble(oreol.getText().toString());
                    updateoreoXl(oreo_xlarge);
                    Toast.makeText(getActivity(), "أوريو كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        oreom_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(oreom.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double oreo_xmedium = Double.parseDouble(oreom.getText().toString());
                    updateoreoXM(oreo_xmedium);
                    Toast.makeText(getActivity(), "أوريو متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        oreos_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(oreos.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double oreo_xsmall = Double.parseDouble(oreos.getText().toString());
                    updateoreoXS(oreo_xsmall);
                    Toast.makeText(getActivity(), "أوريو صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        milkal_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(milkal.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double milka_xlarge = Double.parseDouble(milkal.getText().toString());
                    updatemilkaXl(milka_xlarge);
                    Toast.makeText(getActivity(), "ميلكا كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        milkam_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(milkam.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double milka_xmedium = Double.parseDouble(milkam.getText().toString());
                    updatemilkaXM(milka_xmedium);
                    Toast.makeText(getActivity(), "ميلكا متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        milkas_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(milkas.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double milka_xsmall = Double.parseDouble(milkas.getText().toString());
                    updatemilkaXS(milka_xsmall);
                    Toast.makeText(getActivity(), "ميلكا صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        marsl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(marsl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mars_xlarge = Double.parseDouble(marsl.getText().toString());
                    updatemarsXl(mars_xlarge);
                    Toast.makeText(getActivity(), "مارس كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        marsm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(marsm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mars_xmedium = Double.parseDouble(marsm.getText().toString());
                    updatemarsXM(mars_xmedium);
                    Toast.makeText(getActivity(), "مارس متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        marss_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(marss.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mars_xsmall = Double.parseDouble(marss.getText().toString());
                    updatemarsXS(mars_xsmall);
                    Toast.makeText(getActivity(), "مارس صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        maltl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(maltl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double malt_xlarge = Double.parseDouble(maltl.getText().toString());
                    updatemaltXl(malt_xlarge);
                    Toast.makeText(getActivity(), "مالتيزرس كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        maltm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(maltm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double malt_xmedium = Double.parseDouble(maltm.getText().toString());
                    updatemaltXM(malt_xmedium);
                    Toast.makeText(getActivity(), "مالتيزرس متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        malts_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(malts.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double malt_xsmall = Double.parseDouble(malts.getText().toString());
                    updatemaltXS(malt_xsmall);
                    Toast.makeText(getActivity(), "مالتيزرس صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kitkatl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kitkatl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kitkat_xlarge = Double.parseDouble(kitkatl.getText().toString());
                    updatekitkatXl(kitkat_xlarge);
                    Toast.makeText(getActivity(), "مالتيزرس كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kitkatm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kitkatm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kitkat_xmedium = Double.parseDouble(kitkatm.getText().toString());
                    updatekitkatXM(kitkat_xmedium);
                    Toast.makeText(getActivity(), "مالتيزرس متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kitkats_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(kitkats.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double kitkat_xsmall = Double.parseDouble(kitkats.getText().toString());
                    updatekitkatXS(kitkat_xsmall);
                    Toast.makeText(getActivity(), "مالتيزرس صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mmzl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(mmzl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mmz_xlarge = Double.parseDouble(mmzl.getText().toString());
                    updatemmzXl(mmz_xlarge);
                    Toast.makeText(getActivity(), "إم أند إمز كاكاوية كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mmzm_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(mmzm.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mmz_xmedium = Double.parseDouble(mmzm.getText().toString());
                    updatemmzXM(mmz_xmedium);
                    Toast.makeText(getActivity(), "إم أند إمز كاكاوية متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mmzs_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(mmzs.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double mmz_xsmall = Double.parseDouble(mmzs.getText().toString());
                    updatemmzXS(mmz_xsmall);
                    Toast.makeText(getActivity(), "إم أند إمز كاكاوية صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        duplol_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(duplol.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double duplo_xlarge = Double.parseDouble(duplol.getText().toString());
                    updateduploXl(duplo_xlarge);
                    Toast.makeText(getActivity(), "دوبلا كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        duplom_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(duplom.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double duplo_xmedium = Double.parseDouble(duplom.getText().toString());
                    updateduploXM(duplo_xmedium);
                    Toast.makeText(getActivity(), "دوبلا متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        duplos_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(duplos.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double duplo_xsmall = Double.parseDouble(duplos.getText().toString());
                    updateduploXS(duplo_xsmall);
                    Toast.makeText(getActivity(), "دوبلا صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bountyl_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(bountyl.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double bounty_xlarge = Double.parseDouble(bountyl.getText().toString());
                    updatebountyXl(bounty_xlarge);
                    Toast.makeText(getActivity(), "باونتي كبيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bountym_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(bountym.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double bounty_xmedium = Double.parseDouble(bountym.getText().toString());
                    updatebountyXM(bounty_xmedium);
                    Toast.makeText(getActivity(), "باونتي متوسطة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bountys_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextUtils.isEmpty(bountys.getText().toString()))
                {
                    Toast.makeText(getActivity(), "لا يمكن تركه فارغا", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double bounty_xsmall = Double.parseDouble(bountys.getText().toString());
                    updatebountyXS(bounty_xsmall);
                    Toast.makeText(getActivity(), "باونتي صغيرة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        reference.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                if (isAdded())
                {
                    User user = dataSnapshot.getValue(User.class);

                    username.setText(user.getUsername());

                    if (user.getImageURL().equals("default"))
                    {
                        image_profile.setImageResource(R.mipmap.ic_launcher);
                    } else
                    {
                        Glide.with(getContext()).load(user.getImageURL()).into(image_profile);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
            }
        });

        image_profile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openImage();
            }
        });

        return view;
    }

    private void updateFerreroXS(double ferrero_xsmall) {
        Coos coos = new Coos(ferrero_xsmall);
        ferreroxs.setValue(coos);
    }

    private void updateFerreroXM(double ferrero_xmedium) {
        Coo coo = new Coo(ferrero_xmedium);
        ferreroxm.setValue(coo);
    }

    private void updateFerreroXl(double ferrero_xlarge)
    {
        Coins coins = new Coins(ferrero_xlarge);
        ferreroxl.setValue(coins);
    }

    private void updateKinderXS(double kinder_xsmall) {
        KinderSmallC kinderSmallC = new KinderSmallC(kinder_xsmall);
        kinderxs.setValue(kinderSmallC);
    }

    private void updateKinderXM(double kinder_xmedium) {
        KinderMediumC kinderMediumC = new KinderMediumC(kinder_xmedium);
        kinderxm.setValue(kinderMediumC);
    }

    private void updateKinderXl(double kinder_xlarge) {
        KinderLargeC kinderLargeC = new KinderLargeC(kinder_xlarge);
        kinderxl.setValue(kinderLargeC);
    }

    private void updatesnekresXS(double snekres_xsmall) {
        SnekresSmallC snekresSmallC = new SnekresSmallC(snekres_xsmall);
        snekresxs.setValue(snekresSmallC);
    }

    private void updatesnekresXM(double snekres_xmedium) {
        SnekresMediuomC snekresMediumC = new SnekresMediuomC(snekres_xmedium);
        snekresxm.setValue(snekresMediumC);
    }

    private void updatesnekresXl(double snekres_xlarge) {
        SnekresLargeC snekresLargeC = new SnekresLargeC(snekres_xlarge);
        snekresxl.setValue(snekresLargeC);
    }

    private void updatetwixXS(double twix_xsmall) {
        TwixSmallC twixSmallC = new TwixSmallC(twix_xsmall);
        twixxs.setValue(twixSmallC);
    }

    private void updatetwixXM(double twix_xmedium) {
        TwixMediumC twixMediumC = new TwixMediumC(twix_xmedium);
        twixxm.setValue(twixMediumC);
    }

    private void updatetwixXl(double twix_xlarge) {
        TwixLargeC twixLargeC = new TwixLargeC(twix_xlarge);
        twixxl.setValue(twixLargeC);
    }

    private void updaterafXS(double raf_xsmall) {
        RafSmallC rafSmallC = new RafSmallC(raf_xsmall);
        rafxs.setValue(rafSmallC);
    }

    private void updaterafXM(double raf_xmedium) {
        RafMediumC rafMediumC = new RafMediumC(raf_xmedium);
        rafxm.setValue(rafMediumC);
    }

    private void updaterafXl(double raf_xlarge) {
        RafLargeC rafLargeC = new RafLargeC(raf_xlarge);
        rafxl.setValue(rafLargeC);
    }

    private void updateoreoXS(double oreo_xsmall) {
        OreoSmallC oreoSmallC = new OreoSmallC(oreo_xsmall);
        oreoxs.setValue(oreoSmallC);
    }

    private void updateoreoXM(double oreo_xmedium) {
        OreoMediumC oreoMediumC = new OreoMediumC(oreo_xmedium);
        oreoxm.setValue(oreoMediumC);
    }

    private void updateoreoXl(double oreo_xlarge) {
        OreoLargeC oreoLargeC = new OreoLargeC(oreo_xlarge);
        oreoxl.setValue(oreoLargeC);
    }

    private void updatemilkaXS(double milka_xsmall) {
        MilkaSmallC milkaSmallC = new MilkaSmallC(milka_xsmall);
        milkaxs.setValue(milkaSmallC);
    }

    private void updatemilkaXM(double milka_xmedium) {
        MilkaMediumC milkaMediumC = new MilkaMediumC(milka_xmedium);
        milkaxm.setValue(milkaMediumC);
    }

    private void updatemilkaXl(double milka_xlarge) {
        MilkaLargeC milkaLargeC = new MilkaLargeC(milka_xlarge);
        milkaxl.setValue(milkaLargeC);
    }

    private void updatemarsXS(double mars_xsmall) {
        MarsSmallC marsSmallC = new MarsSmallC(mars_xsmall);
        marsxs.setValue(marsSmallC);
    }

    private void updatemarsXM(double mars_xmedium) {
        MarsMediumC marsMediumC = new MarsMediumC(mars_xmedium);
        marsxm.setValue(marsMediumC);
    }

    private void updatemarsXl(double mars_xlarge) {
        MarsLargeC marsLargeC = new MarsLargeC(mars_xlarge);
        marsxl.setValue(marsLargeC);
    }

    private void updatemaltXS(double malt_xsmall) {
        MaltSmallC maltSmallC = new MaltSmallC(malt_xsmall);
        maltxs.setValue(maltSmallC);
    }

    private void updatemaltXM(double malt_xmedium) {
        MaltMediumC maltMediumC = new MaltMediumC(malt_xmedium);
        maltxm.setValue(maltMediumC);
    }

    private void updatemaltXl(double malt_xlarge) {
        MaltLargeC maltLargeC = new MaltLargeC(malt_xlarge);
        maltxl.setValue(maltLargeC);
    }

    private void updatekitkatXS(double kitkat_xsmall) {
        KitKatSmallC kitkatSmallC = new KitKatSmallC(kitkat_xsmall);
        kitkatxs.setValue(kitkatSmallC);
    }

    private void updatekitkatXM(double kitkat_xmedium) {
        KitKatMediumC kitkatMediumC = new KitKatMediumC(kitkat_xmedium);
        kitkatxm.setValue(kitkatMediumC);
    }

    private void updatekitkatXl(double kitkat_xlarge) {
        KitKatLargeC kitkatLargeC = new KitKatLargeC(kitkat_xlarge);
        kitkatxl.setValue(kitkatLargeC);
    }

    private void updatemmzXS(double mmz_xsmall) {
        MmzSmallC mmzSmallC = new MmzSmallC(mmz_xsmall);
        mmzxs.setValue(mmzSmallC);
    }

    private void updatemmzXM(double mmz_xmedium) {
        MmzMediumC mmzMediumC = new MmzMediumC(mmz_xmedium);
        mmzxm.setValue(mmzMediumC);
    }

    private void updatemmzXl(double mmz_xlarge) {
        MmzLargeC mmzLargeC = new MmzLargeC(mmz_xlarge);
        mmzxl.setValue(mmzLargeC);
    }

    private void updateduploXS(double duplo_xsmall) {
        DuploSmallC duploSmallC = new DuploSmallC(duplo_xsmall);
        duploxs.setValue(duploSmallC);
    }

    private void updateduploXM(double duplo_xmedium) {
        DuploMediumC duploMediumC = new DuploMediumC(duplo_xmedium);
        duploxm.setValue(duploMediumC);
    }

    private void updateduploXl(double duplo_xlarge) {
        DuploLargeC duploLargeC = new DuploLargeC(duplo_xlarge);
        duploxl.setValue(duploLargeC);
    }

    private void updatebountyXS(double bounty_xsmall) {
        BountySmallC bountySmallC = new BountySmallC(bounty_xsmall);
        bountyxs.setValue(bountySmallC);
    }

    private void updatebountyXM(double bounty_xmedium) {
        BountyMediumC bountyMediumC = new BountyMediumC(bounty_xmedium);
        bountyxm.setValue(bountyMediumC);
    }

    private void updatebountyXl(double bounty_xlarge) {
        BountyLargeC bountyLargeC = new BountyLargeC(bounty_xlarge);
        bountyxl.setValue(bountyLargeC);
    }

    private void openImage()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, IMAGE_REQUEST);
    }

    private String getFileExtension(Uri uri)
    {
        ContentResolver contentResolver = getContext().getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    private void uploadImage()
    {
        final ProgressDialog pd = new ProgressDialog(getContext());
        pd.setMessage("Uploading");
        pd.show();

        if (imageUri != null)
        {
            final StorageReference fileReference = storageReference.child(System.currentTimeMillis() + "." + getFileExtension(imageUri));

            uploadTask = fileReference.putFile(imageUri);
            uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>()
            {
                @Override
                public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception
                {
                    if (!task.isSuccessful())
                    {
                        throw task.getException();
                    }

                    return fileReference.getDownloadUrl();
                }
            }).addOnCompleteListener(new OnCompleteListener<Uri>()
            {
                @Override
                public void onComplete(@NonNull Task<Uri> task)
                {
                    if (task.isSuccessful())
                    {
                        Uri downloadUri = task.getResult();
                        String mUri = downloadUri.toString();

                        reference = FirebaseDatabase.getInstance().getReference("Users").child(fuser.getUid());
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("imageURL", mUri);
                        reference.updateChildren(map);

                        pd.dismiss();
                    }
                    else
                    {
                        Toast.makeText(getContext(), "Failed!", Toast.LENGTH_SHORT).show();
                        pd.dismiss();
                    }
                }
            }).addOnFailureListener(new OnFailureListener()
            {
                @Override
                public void onFailure(@NonNull Exception e)
                {
                    Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    pd.dismiss();
                }
            });
        }
        else
        {
            Toast.makeText(getContext(), "No image selected", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null)
        {
            imageUri = data.getData();

            if (uploadTask != null && uploadTask.isInProgress())
            {
                Toast.makeText(getContext(), "Upload in Progress", Toast.LENGTH_SHORT).show();
            }
            else
            {
                uploadImage();
            }
        }
    }
}