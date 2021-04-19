package com.richieoscar.tourguide.data;

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

    public static ArrayList<Attraction> getCenteres(){
        centres = new ArrayList<>();
        centres.add(new Attraction("Lekki Conversation Centre", "Km 19 Lekki Epe Express, Lekki Penninsula","09065460479", "8:30am - 4:00pm", R.drawable.lekkiconservation));
        centres.add(new Attraction("Nike Art Centre", "2 Oba Yekini Elegushi Rd, Lekki Phase 1","08034096656", "8:30am - 4:00pm", R.drawable.nikeart));
        centres.add(new Attraction("National Museum Lagos", "Onikan Rd Ikoyi Lagos","09065460479", "8:30am - 3:30pm", R.drawable.nationalmuseum));
        centres.add(new Attraction("Freedom Park ", "Old Prison Ground, Broad St, Lagos Island","08033022587", "8:30am - 10:00pm,", R.drawable.freedompark));
        centres.add(new Attraction("Eko Atlantic", "1412 Ahmadu Bello Way, Victoria Island Lagos","012910180", "8:30am - 5pm:00pm",R.drawable.ekoatlantic));
        centres.add(new Attraction("Jhalobia Recreation Park and Gardens", "M/M Int Airport Rd,between Haij Camp & Ajao Estate","08037257855", "8:30am - 7:00pm", R.drawable.jhalobia));
        centres.add(new Attraction("Ndubuisi Kanu Park", "House of Assembly, Ndubuisi Kanu Park, Mobolaji Johnson Avenue Opp, Alausa Ikeja","09034296168", "8:30am - 6:00pm", R.drawable.ndubuisipark));
        centres.add(new Attraction("Hi-Impact Planet Amusement Park", "Km 12 Lagos -Ibadan Express Ibafo","09065360479", "8:30am - 4:00pm",R.drawable.hiimpact ));
        centres.add(new Attraction("Fun Factory", "10 Lai Yusuf Crescent, Admiralty Way, Lekki Phase 1 Lekki","0809828888", "8:30am - 8:00pm",R.drawable.funfactory));
        centres.add(new Attraction("Kernel Park", "6a Kernel St, Iganmu Lagos","080418888", "Temporarily Closed",R.drawable.kernelpark));
        centres.add(new Attraction("Muri Okunola Park", "Ozumba Mbadiwe Rd, Eti-Osa Lagos","0809828888", "8:30am - 8:00pm",R.drawable.muripark));
        centres.add(new Attraction("Johnson Jakande Tinumbu Park", "Governor's Rd, Alausa Ikeja Lagos","08005277275", "8:30am - 6:00pm",R.drawable.jhalobia));
        return centres;
    }
    public static ArrayList<Attraction> beaches(){
        beaches = new ArrayList<>();
        beaches.add(new Beach("Tarkwa Bay", "Lekki", "014247582", "24hrs", R.drawable.tarkwabay));
        beaches.add(new Beach("Elegushi Royal", "By Rd 3, Lekki Phase 1, Lekki", "Not Available", "24 hours", R.drawable.elegushi));
        beaches.add(new Beach("llashe Beach", "Lekki", "014247582", "24hrs", R.drawable.illashebach));
        beaches.add(new Beach("Landmark Beach", "Lekki", "09066882627", "24hrs", R.drawable.landmarkbeach));
        beaches.add(new Beach("Alpha Beach", "Lekki", "0806587582", "24hrs", R.drawable.alphabeach));
        beaches.add(new Beach("Victoria Beach", "Victoria Island Lekki", "014318582", "24hrs", R.drawable.victoriabeach));
        beaches.add(new Beach("Oniru Beach", "Eti-Osa,Lagos", "014247582", "8:00am - 9:00pm", R.drawable.onirubeach));
        beaches.add(new Beach("Atlas Beach", "Victoria Island Lekki", "01228772", "24hrs", R.drawable.atlasbeach));
        beaches.add(new Beach("Banana Island", "Banana Island Lagos", "01228772", "24hrs", R.drawable.elegushi));
        beaches.add(new Beach("Kuramo Beach", "Karumo  Lagos", "01228772", "24hrs", R.drawable.karumobeach));
        beaches.add(new Beach("Kids Beach Garden", "Lekki Lagos", "0803378641", "24hrs", R.drawable.landmarkbeach));
        return beaches;
    }

    public static ArrayList<Attraction> hotels (){
        hotels = new ArrayList<>();
        hotels.add(new Hotel("Lagos Atlantic Hotel", "750m from Porto de Mos Beach", "00011111", "24 hours", R.drawable.lagostatlantic));
        hotels.add(new Hotel("Sheraton Hotel", "Ikeja Lagos", "00011111", "24 hours", R.drawable.sheraton));
        hotels.add(new Hotel("Aqualuz Hotel", "Rua Sacadura Cabral, 8 Lagos", "00011111", "24 hours", R.drawable.aqualuz));
        hotels.add(new Hotel("Federal Palace Hotel", "6-8 Ahmadu Bello Way, Victoria Island Lagos", "00011111", "24 hours", R.drawable.federalpalace));
        hotels.add(new Hotel("Eko Hotels and Suites", "750m from Porto de Mos Beach", "00011111", "24 hours", R.drawable.ekohotels));
        hotels.add(new Hotel("Protea Hotels", "30 Lugard Avenue, Ikoyi Lagos", "00011111", "24 hours", R.drawable.proteahotel));
        hotels.add(new Hotel("The George Hotel", "750m from Porto de Mos Beach", "00011111", "24 hours", R.drawable.thegeorge));
        hotels.add(new Hotel("Lagos Continental Hotel", "Plot 52A Kofo Abayomi Street, Victoria Island Lagos", "01879641", "24 hours", R.drawable.lagostatlantic));
        hotels.add(new Hotel("The Wheatbaker", "4 Onitilo Road Lawrence Road, Ikoyi Lagos", "00011111", "24 hours", R.drawable.wheatbaker));
        hotels.add(new Hotel("The Yatch Hotel", "Admiralty Road Plot 1, Block 12 Lagos", "00011111", "24 hours", R.drawable.yatchhotel));
        hotels.add(new Hotel("Oriental Hotel", "3, Maroko Road Lekki - Epe Express Way Eti Osa Lagos", "00011111", "24 hours", R.drawable.oriental));
        hotels.add(new Hotel("The white Orchid Hotel", "72 Adetokunbo Ademola Stree Lagos", "00011111", "24 hours", R.drawable.whiteorchid));
        hotels.add(new Hotel("Villa Monument Hotel", "9B Oko Awo Street Victoria Island", "00011111", "24 hours", R.drawable.villamonumental));
        hotels.add(new Hotel("Galpin Suites", "1 Jafac, Adeniyi Jones Avenue, Alh Jimoh Street Ikeja", "00011111", "24 hours", R.drawable.aqualuz));
        return hotels;
    }
    public static ArrayList<Attraction> theaters() {
        theatres = new ArrayList<>();
        theatres.add(new Theatre("IMAX Filmhouse Cinema", "The Rock drive, off Bisola Durosinmi Etti Drive, Lekki Phase 1, Lagos", "014778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.imaxcinema));
        theatres.add(new Theatre("Leisure Mall Filmhouse Cinema", "Leisure Mall, Adeniran Ogunsanya Street, Surulere, Lagos", "012547524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.filmhouse));
        theatres.add(new Theatre("Filmhouse Cinema", "Landmark Village, Victoria Island, Lagos", "014778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.filmhouse));
        theatres.add(new Theatre("Genesis Deluxe Cinema", "1 Bisway Street, Maroko, Lagos", "08025458524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.genesis));
        theatres.add(new Theatre("Maryland Mall Genesis Deluxe Cinema", "Ikorodu Road, Lagos", "09054778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.marylandmall));
        theatres.add(new Theatre("Silvebird Cinema", "133, Ahmadu Bello Way Victoria Island, Lagos", "0807458524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.silverbirdcinemas));
        theatres.add(new Theatre("Ozone  Cinema", "E-Centre 1-11 Commercial Avenue, Sabo Yaba, Lagos", "0125778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.ozonecinemas));
        theatres.add(new Theatre("Marturion Cinema", "Brainfield Event Centre,3 LASU Isheri road, Igando, Lagos", "0147365524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.marturioncinema));
        theatres.add(new Theatre("Magnificient Cinema", "180/184 Ikorodu Road. 2nd Floor Moyosere House, Onipanu Somolu, Lagos", "014778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.filmhouse));
        theatres.add(new Theatre("Viva Cinema", "87,Cemetry Street, Off Abeokuta Street, Ebute-Metta Lagos", "08172657928", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.genesis));
        theatres.add(new Theatre("Ground Zero Arcade and Cinema", "The Rock drive, off Bisola Durosinmi Etti Drive, Lekki Phase 1, Lagos", "014778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.genesis));
        theatres.add(new Theatre("Masas Cinema", "Alaba, Ojo, Alaba Rago Modern Market, Abuja Lane Ojo, Lagos", "09024778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.filmhouse));
        theatres.add(new Theatre("Dews Cinema", "Dream Center Plot 1, 202 Road, 2nd avenue Festac Town, Lagos", "08064778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.aqualuz));
        theatres.add(new Theatre("Sky Cinema", "Lekki Lagos", "08064778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.marylandmall));
        theatres.add(new Theatre("Silverbird Cinema Ikeja City Mall", "Ikeja City Mall 174/194, Obafemi Awolowo way Alausa Ikeja, Lagos", "08084778524", "Weekdays\n10:00am - 12 midnight\n\nWeekends\n10:00am - 2:00am", R.drawable.silverbirdcinemas));
        return theatres;
    }
}
