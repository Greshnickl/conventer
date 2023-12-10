import java.util.Scanner;

public class Options {
    public static void main_option(String token){
        commands();
        command_handler(token);
    }

    public static void commands(){
        System.out.println("""
                To transfer currencies you need:
                1. Enter the code of the currency from which you want to transfer
                2. The code of the currency you want to transfer
                3. The amount of the input currency
                
                To start type "start"
                To transfer one more time type "start"
                If you need list of currencies type "help"
                
                """);
    }
    public static void run(String token){
        String input = " ";
        while (!check_curency(input)){
            System.out.println("Enter input currency: ");
            input = take_c().toUpperCase();
        }
        String output = " ";
        while (!check_curency(output)){
            System.out.println("Enter output currency: ");
            output = take_c().toUpperCase();
        }
        System.out.println("Enter amount of input currency: ");
        Double count = take_count();
        Exchange_rate.show_rate(input.toUpperCase(), output.toUpperCase(), count, token);
    }
    public static void command_handler(String token){
        System.out.println("Enter command: ");
        Scanner command_sc = new Scanner(System.in);
        String command = command_sc.nextLine();

        switch (command){
            case "start":
                run(token);
                command_handler(token);
                break;
            case "help":
                help();
                command_handler(token);
                break;
            default:
                System.out.println("Wrong operation, try again");
                command_handler(token);
                break;
        }
    }

    public static void help() {
        System.out.println("""
                Available currencies:
                AED (United Arab Emirates Dirham)
                AFN (Afghan Afghani)
                ALL (Albanian Lek)
                AMD (Armenian Dram)
                ANG (Netherlands Antillean Guilder)
                AOA (Angolan Kwanza)
                ARS (Argentine Peso)
                AUD (Australian Dollar)
                AWG (Aruban Florin)
                AZN (Azerbaijani Manat)
                BAM (Bosnia-Herzegovina Convertible Mark)
                BBD (Barbadian Dollar)
                BDT (Bangladeshi Taka)
                BGN (Bulgarian Lev)
                BHD (Bahraini Dinar)
                BIF (Burundian Franc)
                BMD (United States Dollar)
                BND (Brunei Dollar)
                BOB (Bolivian Boliviano)
                BRL (Brazilian Real)
                BSD (Bahamian Dollar)
                BTN (Bhutanese Ngultrum)
                BWP (Botswana Pula)
                BYN (Belarusian Ruble)
                BZD (Belize Dollar)
                CAD (Canadian Dollar)
                CDF (Congolese Franc)
                CHF (Swiss Franc)
                CLP (Chilean Peso)
                CNY (Chinese Yuan)
                COP (Colombian Peso)
                CRC (Costa Rican Colón)
                CUP (Cuban Peso)
                CVE (Cape Verdean Escudo)
                CZK (Czech Koruna)
                DJF (Djiboutian Franc)
                DKK (Danish Krone)
                DOP (Dominican Peso)
                DZD (Algerian Dinar)
                EGP (Egyptian Pound)
                ERN (Eritrean Nakfa)
                ETB (Ethiopian Birr)
                EUR (Euro)
                FJD (Fijian Dollar)
                FKP (Falkland Islands Pound)
                FOK (Faroese Króna)
                GBP (British Pound Sterling)
                GEL (Georgian Lari)
                GGP (Guernsey Pound)
                GHS (Ghanaian Cedi)
                GIP (Gibraltar Pound)
                GMD (Gambian Dalasi)
                GNF (Guinean Franc)
                GTQ (Guatemalan Quetzal)
                GYD (Guyanaese Dollar)
                HKD (Hong Kong Dollar)
                HNL (Honduran Lempira)
                HRK (Croatian Kuna)
                HTG (Haitian Gourde)
                HUF (Hungarian Forint)
                IDR (Indonesian Rupiah)
                ILS (Israeli New Shekel)
                IMP (Isle of Man Pound)
                INR (Indian Rupee)
                IQD (Iraqi Dinar)
                IRR (Iranian Rial)
                ISK (Icelandic Króna)
                JEP (Jersey Pound)
                JMD (Jamaican Dollar)
                JOD (Jordanian Dinar)
                JPY (Japanese Yen)
                KES (Kenyan Shilling)
                KGS (Kyrgyzstani Som)
                KHR (Cambodian Riel)
                KID (Kiribati Dollar)
                KMF (Comorian Franc)
                KRW (South Korean Won)
                KWD (Kuwaiti Dinar)
                KYD (Cayman Islands Dollar)
                KZT (Kazakhstani Tenge)
                LAK (Laotian Kip)
                LBP (Lebanese Pound)
                LKR (Sri Lankan Rupee)
                LRD (Liberian Dollar)
                LSL (Lesotho Loti)
                LYD (Libyan Dinar)
                MAD (Moroccan Dirham)
                MDL (Moldovan Leu)
                MGA (Malagasy Ariary)
                MKD (Macedonian Denar)
                MMK (Myanmar Kyat)
                MNT (Mongolian Tugrik)
                MOP (Macanese Pataca)
                MRU (Mauritanian Ouguiya)
                MUR (Mauritian Rupee)
                MVR (Maldivian Rufiyaa)
                MWK (Malawian Kwacha)
                MXN (Mexican Peso)
                MYR (Malaysian Ringgit)
                MZN (Mozambican Metical)
                NAD (Namibian Dollar)
                NGN (Nigerian Naira)
                NIO (Nicaraguan Córdoba)
                NOK (Norwegian Krone)
                NPR (Nepalese Rupee)
                NZD (New Zealand Dollar)
                OMR (Omani Rial)
                PAB (Panamanian Balboa)
                PEN (Peruvian Nuevo Sol)
                PGK (Papua New Guinean Kina)
                PHP (Philippine Peso)
                PKR (Pakistani Rupee)
                PLN (Polish Zloty)
                PYG (Paraguayan Guarani)
                QAR (Qatari Rial)
                RON (Romanian Leu)
                RSD (Serbian Dinar)
                RUB (Russian Ruble)
                RWF (Rwandan Franc)
                SAR (Saudi Riyal)
                SBD (Solomon Islands Dollar)
                SCR (Seychellois Rupee)
                SDG (Sudanese Pound)
                SEK (Swedish Krona)
                SGD (Singapore Dollar)
                SHP (Saint Helena Pound)
                SLE (Sierra Leonean Leone)
                SLL (Sierra Leonean Leone)
                SOS (Somali Shilling)
                SRD (Surinamese Dollar)
                SSP (South Sudanese Pound)
                STN (São Tomé and Príncipe Dobra)
                SYP (Syrian Pound)
                SZL (Swazi Lilangeni)
                THB (Thai Baht)
                TJS (Tajikistani Somoni)
                TMT (Turkmenistani Manat)
                TND (Tunisian Dinar)
                TOP (Tongan Pa'anga)
                TRY (Turkish Lira)
                TTD (Trinidad and Tobago Dollar)
                TVD (Tuvaluan Dollar)
                TWD (New Taiwan Dollar)
                TZS (Tanzanian Shilling)
                UAH (Ukrainian Hryvnia)
                UGX (Ugandan Shilling)
                USD (US Dollar)
                UYU (Uruguayan Peso)
                UZS (Uzbekistan Som)
                VES (Venezuelan Bolívar)
                VND (Vietnamese Dong)
                VUV (Vanuatu Vatu)
                WST (Samoan Tala)
                XAF (Central African CFA Franc)
                XCD (East Caribbean Dollar)
                XDR (Special Drawing Rights)
                XOF (West African CFA Franc)
                XPF (CFP Franc)
                YER (Yemeni Rial)
                ZAR (South African Rand)
                ZMW (Zambian Kwacha)
                ZWL (Zimbabwean Dollar)
                -----------------------------------
                """);
    }
    public static String take_c(){
        Scanner c_sc = new Scanner(System.in);
        String c = c_sc.nextLine();
        return c;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static double take_count(){
        Scanner c_sc = new Scanner(System.in);
        String c = c_sc.nextLine();
        if (isNumeric(c)){
            return Double.parseDouble(c);
        } else {
            System.out.println("The entered data is not a number, try again.");
        }
        return 0.0;
    }


    public static boolean check_curency(String c){
        String[] curencies ={"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
                "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL",
                "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY",
                "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP",
                "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS",
                "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF",
                "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD",
                "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT",
                "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD",
                "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN",
                "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK",
                "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR",
                "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLE", "SLL", "SOS", "SRD",
                "SSP", "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY",
                "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VES",
                "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR",
                "ZMW", "ZWL"
        };
        for (int i = 0; i < curencies.length; i++){
            if (curencies[i].equals(c)){
                return true;
            }
        }
        return false;
    }




}
