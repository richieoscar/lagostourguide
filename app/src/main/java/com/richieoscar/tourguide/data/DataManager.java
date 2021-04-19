package com.richieoscar.tourguide.data;

import android.content.Context;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.model.Attraction;
import com.richieoscar.tourguide.model.Beach;
import com.richieoscar.tourguide.model.Hotel;
import com.richieoscar.tourguide.model.Theatre;

import java.util.ArrayList;

public class DataManager {

    private static ArrayList<Attraction> hotels;
    private static ArrayList<Attraction> beaches;
    private static ArrayList<Attraction> centres;
    private static ArrayList<Attraction> theatres;

    public static ArrayList<Attraction> getCenteres(Context context){
        centres = new ArrayList<>();
        centres.add(new Attraction(context.getString(R.string.lekki_conversation_name), context.getString(R.string.lekki_cov_location),context.getString(R.string.lekki_coversatio_phone), context.getString(R.string.lekki_conversation_open), R.drawable.lekkiconservation));
        centres.add(new Attraction(context.getString(R.string.nike_art_name), context.getString(R.string.nike_art_location),context.getString(R.string.nike_art_phone), context.getString(R.string.nike_art_open), R.drawable.nikeart));
        centres.add(new Attraction(context.getString(R.string.national_museum_name), context.getString(R.string.national_museum_location),context.getString(R.string.national_museum_phone), context.getString(R.string.national_museum_open), R.drawable.nationalmuseum));
        centres.add(new Attraction(context.getString(R.string.freedom_park_name), context.getString(R.string.freedom_park_location),context.getString(R.string.freedom_park_phone), context.getString(R.string.freedom_park_open), R.drawable.freedompark));
        centres.add(new Attraction(context.getString(R.string.eko_atlantic_name), context.getString(R.string.eko_atlantic_location),context.getString(R.string.eko_atlantic_phone), context.getString(R.string.eko_atlantic_open),R.drawable.ekoatlantic));
        centres.add(new Attraction(context.getString(R.string.jhalobia_name), context.getString(R.string.jhaloabia_location),context.getString(R.string.jhalobia_phone), context.getString(R.string.jhalobia_open), R.drawable.jhalobia));
        centres.add(new Attraction(context.getString(R.string.ndubuisi_name), context.getString(R.string.ndubuisi_location),context.getString(R.string.ndubuisi_phone), context.getString(R.string.ndubuis_open), R.drawable.ndubuisipark));
        centres.add(new Attraction(context.getString(R.string.hiimpact_name), context.getString(R.string.hiimpact_location),context.getString(R.string.hiimpact_phone), context.getString(R.string.hiimpact_open),R.drawable.hiimpact ));
        centres.add(new Attraction(context.getString(R.string.funfuctory_name), context.getString(R.string.funfactory_location),context.getString(R.string.funfactory_phone), context.getString(R.string.funfactory_open),R.drawable.funfactory));
        centres.add(new Attraction(context.getString(R.string.kernel_name), context.getString(R.string.kernel_location),context.getString(R.string.kernel_phone), context.getString(R.string.kernel_open),R.drawable.kernelpark));
        centres.add(new Attraction(context.getString(R.string.muri_name), context.getString(R.string.muri_location),context.getString(R.string.muri_phone), context.getString(R.string.muri_open),R.drawable.muripark));
        centres.add(new Attraction(context.getString(R.string.johnson_name), context.getString(R.string.johnson_location),context.getString(R.string.johnson_phone), context.getString(R.string.johnson_open),R.drawable.jhalobia));
        return centres;
    }
    public static ArrayList<Attraction> beaches(Context context){
        beaches = new ArrayList<>();
        beaches.add(new Beach(context.getString(R.string.tarkwabay_name), context.getString(R.string.tarkwabay_location), context.getString(R.string.tarkwabay_phone), context.getString(R.string.tarkwabay_open), R.drawable.tarkwabay));
        beaches.add(new Beach(context.getString(R.string.elegushi_name), context.getString(R.string.elegushi_location), context.getString(R.string.elegushi_phone), context.getString(R.string.elegushi_open), R.drawable.elegushi));
        beaches.add(new Beach(context.getString(R.string.illashe_name), context.getString(R.string.illashe_location), context.getString(R.string.illashe_phone), context.getString(R.string.illashe_open), R.drawable.illashebach));
        beaches.add(new Beach(context.getString(R.string.landmark_name), context.getString(R.string.landmark_location), context.getString(R.string.landmark_phone), context.getString(R.string.landmark_open), R.drawable.landmarkbeach));
        beaches.add(new Beach(context.getString(R.string.alpha_name), context.getString(R.string.alpha_location), context.getString(R.string.alpha_phone), context.getString(R.string.alpha_open), R.drawable.alphabeach));
        beaches.add(new Beach(context.getString(R.string.victoria_name), context.getString(R.string.victoria_location), context.getString(R.string.victoria_phone), context.getString(R.string.victoria_open), R.drawable.victoriabeach));
        beaches.add(new Beach(context.getString(R.string.oniru_name), context.getString(R.string.oniru_locatiob), context.getString(R.string.oniru_phone), context.getString(R.string.oniru_open), R.drawable.onirubeach));
        beaches.add(new Beach(context.getString(R.string.atlas_name), context.getString(R.string.atlas_location), context.getString(R.string.atlas_phone), context.getString(R.string.atlas_open), R.drawable.atlasbeach));
        beaches.add(new Beach(context.getString(R.string.banana_name), context.getString(R.string.banana_location), context.getString(R.string.banana_phone), context.getString(R.string.banana_open), R.drawable.elegushi));
        beaches.add(new Beach(context.getString(R.string.karumu_name), context.getString(R.string.karumo_location), context.getString(R.string.karumo_phone), context.getString(R.string.karumo_open), R.drawable.karumobeach));
        beaches.add(new Beach(context.getString(R.string.kids_name), context.getString(R.string.kids_location), context.getString(R.string.kids_phone), context.getString(R.string.kids_open), R.drawable.landmarkbeach));
        return beaches;
    }

    public static ArrayList<Attraction> hotels (Context context){
        hotels = new ArrayList<>();
        hotels.add(new Hotel(context.getString(R.string.lagos_atlantic_name), context.getString(R.string.lagos_atlantic_location), context.getString(R.string.lagos_atlantic_phone), context.getString(R.string.lagos_atlantic_open), R.drawable.lagostatlantic));
        hotels.add(new Hotel(context.getString(R.string.sheraton_name), context.getString(R.string.sheraton_location), context.getString(R.string.sheraton_phone), context.getString(R.string.sheraton_open), R.drawable.sheraton));
        hotels.add(new Hotel(context.getString(R.string.aqualuz_name), context.getString(R.string.aqualuz_location), context.getString(R.string.aqualuz_phone), context.getString(R.string.aqualuz_open), R.drawable.aqualuz));
        hotels.add(new Hotel(context.getString(R.string.federal_name), context.getString(R.string.federal_location), context.getString(R.string.federal_phone), context.getString(R.string.federal_open), R.drawable.federalpalace));
        hotels.add(new Hotel(context.getString(R.string.eko_name), context.getString(R.string.eko_location), context.getString(R.string.eko_phone), context.getString(R.string.eko_open), R.drawable.ekohotels));
        hotels.add(new Hotel(context.getString(R.string.protea_name), context.getString(R.string.protea_location), context.getString(R.string.protea_phone), context.getString(R.string.protea_open), R.drawable.proteahotel));
        hotels.add(new Hotel(context.getString(R.string.george_name), context.getString(R.string.george_location), context.getString(R.string.george_phone), context.getString(R.string.george_open), R.drawable.thegeorge));
        hotels.add(new Hotel(context.getString(R.string.lagos_continental_name), context.getString(R.string.lagos_continental_location), context.getString(R.string.lagos_continental_phone), context.getString(R.string.lagos_continental_open), R.drawable.lagostatlantic));
        hotels.add(new Hotel(context.getString(R.string.wheatbaker_name), context.getString(R.string.wheatbaker_location), context.getString(R.string.wheatbaker_phone), context.getString(R.string.wheatbaker_open), R.drawable.wheatbaker));
        hotels.add(new Hotel(context.getString(R.string.yatch_name), context.getString(R.string.yatch_location), context.getString(R.string.yatch_phone), context.getString(R.string.yatch_open), R.drawable.yatchhotel));
        hotels.add(new Hotel(context.getString(R.string.oriental_name), context.getString(R.string.oriental_location), context.getString(R.string.oriental_phone), context.getString(R.string.oriental_open), R.drawable.oriental));
        hotels.add(new Hotel(context.getString(R.string.white_orchid_name), context.getString(R.string.white_orchid_location), context.getString(R.string.white_orchid_phone), context.getString(R.string.white_orchid_open), R.drawable.whiteorchid));
        hotels.add(new Hotel(context.getString(R.string.villa_name), context.getString(R.string.villa_location), context.getString(R.string.villa_phone), context.getString(R.string.villa_open), R.drawable.villamonumental));
        hotels.add(new Hotel(context.getString(R.string.galpin_name), context.getString(R.string.galpin_location), "0702501111", context.getString(R.string.galpin_open), R.drawable.aqualuz));
        return hotels;
    }
    public static ArrayList<Attraction> theaters(Context context) {
        theatres = new ArrayList<>();
        theatres.add(new Theatre(context.getString(R.string.imax_name), context.getString(R.string.imax_location), context.getString(R.string.imax_phone), context.getString(R.string.imax_open), R.drawable.imaxcinema));
        theatres.add(new Theatre(context.getString(R.string.leisure_name), context.getString(R.string.leisure_location), context.getString(R.string.leisure_phone), context.getString(R.string.leisure_open), R.drawable.filmhouse));
        theatres.add(new Theatre(context.getString(R.string.filmhouse_name), context.getString(R.string.filmhouse_location), context.getString(R.string.filmhouse_phone), context.getString(R.string.filmhouse_open), R.drawable.filmhouse));
        theatres.add(new Theatre(context.getString(R.string.genesis_name), context.getString(R.string.genesis_location), context.getString(R.string.genesis_phone), context.getString(R.string.genesis_open), R.drawable.genesis));
        theatres.add(new Theatre(context.getString(R.string.maryland_name), context.getString(R.string.maryland_location), context.getString(R.string.maryland_phone), context.getString(R.string.maryland_open), R.drawable.marylandmall));
        theatres.add(new Theatre(context.getString(R.string.silverbird_name), context.getString(R.string.silverbird_location), context.getString(R.string.silverbird_phone), context.getString(R.string.silverbird_open), R.drawable.silverbirdcinemas));
        theatres.add(new Theatre(context.getString(R.string.ozone_name), context.getString(R.string.ozone_location), context.getString(R.string.ozone_phone), context.getString(R.string.ozone_open), R.drawable.ozonecinemas));
        theatres.add(new Theatre(context.getString(R.string.maturion_name), context.getString(R.string.maturion_location), context.getString(R.string.maturion_phone), context.getString(R.string.maturion_open), R.drawable.marturioncinema));
        theatres.add(new Theatre(context.getString(R.string.magnificient_name), context.getString(R.string.magnificient_location), context.getString(R.string.magnificient_phone), context.getString(R.string.magnificient_open), R.drawable.filmhouse));
        theatres.add(new Theatre(context.getString(R.string.viva_name), context.getString(R.string.viva_location), context.getString(R.string.viva_phone), context.getString(R.string.viva_open), R.drawable.genesis));
        theatres.add(new Theatre(context.getString(R.string.ground_name), context.getString(R.string.ground_location), context.getString(R.string.ground_phone), context.getString(R.string.ground_open), R.drawable.genesis));
        theatres.add(new Theatre(context.getString(R.string.masa_name), context.getString(R.string.masa_location), context.getString(R.string.masas_phone), context.getString(R.string.masas_open), R.drawable.filmhouse));
        theatres.add(new Theatre(context.getString(R.string.dews_name), context.getString(R.string.dews_location), context.getString(R.string.dews_phone), context.getString(R.string.dews_open), R.drawable.aqualuz));
        theatres.add(new Theatre(context.getString(R.string.sky_name), context.getString(R.string.sky_location), context.getString(R.string.sky_phone), context.getString(R.string.sky_open), R.drawable.marylandmall));
        theatres.add(new Theatre(context.getString(R.string.ikeja_mall_name), context.getString(R.string.ikeja_mall_location), context.getString(R.string.ikeja_mall_phone), context.getString(R.string.ikeja_mall_open), R.drawable.silverbirdcinemas));
        return theatres;
    }
}
