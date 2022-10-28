import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String cipherText = "OYKWUXRNJOOPPTXCTYNYQHFCQNIIWNKPAZQSTIFHOOWEYEHDQQYZMFQDHGZWUQIEZOUJNCEHDQQERBNJKRMRGLWIXVLVPFOBLLAVOPZENPADJPKVMMMPDYXJCBWEX";
        String[] keys = "00 DTYLUKCNOIVSEPFQJWRGMBZAXH\n01 LOGKWPRMDUVSYFJNTQIHEAZCBX\n02 YGSKCJETRMUWNHQXIZFAOVBLDP\n03 BERHJYKWCSLNPDZIGFUAOXVQTM\n04 JLSGAOPZEMBVQCUIYDTHXRWFKN\n05 IPWSURJTOQGEVDBMYKLNHAXZFC\n06 CGLXSIBTJHOKNDMQPVRZAYEFUW\n07 YGHKDVLQEXUOASZWPJFBCNRITM\n08 ACZLSOGEDPYWFXHBVIMUKNTJQR\n09 XTHNIBAFEUQSGLJDWOZKMPVCYR\n10 MFKGNURPJZTBQWLCASIHVYOXDE\n11 NHTEPCFDXRYZBAIMSGVJKUOQWL\n12 AHFPGVUKLMNCTSRDEIWZXYQBOJ\n13 SAHIKWDQJNPVUTZCBYLOGFMREX\n14 GPNWMTOSQHJVYKFEALXCIRDBZU\n15 GPCWQOSVZKINJHERUABDTMXLFY\n16 NKAELXYVRDOGZIMTFUBSPJQHWC\n17 EFTXLBCAWHUJGVOMYRSNKDQIZP\n18 ZLNRQBAVYMJUDOTSHXCWGPKIEF\n19 YAGDUTFIXMBWLOJQVNERHKSZPC\n20 THRAWJEMNFKYZCIGOBXVSULDQP\n21 INESDOMTPBQGHYFUZCRVWLKJXA\n22 YIRAELHQOSXGCWTPJVZUNFMDKB\n23 ITLFAXYCMOPVGZHURDBWNSJQKE\n24 QRJGEFWVLKSUHPCXYBMOITNZAD\n25 VYGNODPUJEMFCZIXASKBWHRTLQ\n26 ANZIFPCLOKMHSJDEWVBYQXTURG\n27 NEBZCRMKDPATGLSOWHFIJQVUYX\n28 EQJTZFYSINAUBWCVDXRKHPLGMO\n29 KDOTRBZWIAUYPLNHEGFQSJMCXV\n30 XVSRDIUZFCQTMPLHYEGJAKNWOB\n31 MVELIBQAFGJNPCKWXUSTZRDYHO\n32 BMOITNEWDAUVPHZJXYSLRQCFGK\n33 UYWVFPNHDCRSMZQGXOBTEKLAIJ\n34 LBTNMCYODQIKHSFUJEVARPXWGZ\n35 NFGUQPSTMCKOXJVWELIABRHYZD\n36 CWMFKHPLOVIQXDARBUTEGZJSNY\n37 ITOPAJWHEDZKMCVUXBYQSNLRGF\n38 EODXLUVTSYHMFGAJNWPZQBCIKR\n39 HZACTFNPIXMQRDUBYKVJOGWLES\n40 KYFAZHCLPNQGXWDTVBORUJIMSE\n41 NSWZTGXHKVBPCORLYQEAIJDFUM\n42 XSYLMPKQIZWEANTOVHRDBFUCGJ\n43 XYISKJVQMTRCAUNGZEOHFWLBDP\n44 KDMEPYHGQZTSUVJFXOILRANBWC\n45 GEVKJRNFBXWQPHDOAMTLIZYUCS\n46 MZEKBDFIGQTLJPOWUXSHCRNYVA\n47 AZLETRUFIPJHBXKOSYQMNGDCVW\n48 KNEOJVXFQWCHTDGUMZLYSRAIPB\n49 UIROVSWAGEQXTHZCFYLBDJPKMN\n50 XBDQIFRUVENLHOAZPWGMKJTCSY\n51 BPJZGEVCNTMAOIKHDWSRFUXQLY\n52 CXEDARNFZGLSPWKQHTVIUBMOJY\n53 IZMLCRNWAKTBUHJSPFOEGYQXDV\n54 JOBCRSIAHGZKNYQLDFEPVXWMUT\n55 WPCKJMQTZIELARUBSOXFVYHDNG\n56 KHVUDGMOJWPYRFSQBLZACITNXE\n57 VFIZLTQPMKRACDSOGJXEUNBWYH\n58 GFYVTDQLHWJPKMBAZNIUOSCXER\n59 QKMSFAZBVPHGWIODEXUCNYJLTR\n60 IAPDHNYVFCMOERLUJTQBWSZXKG\n61 ARZOWSMPBKJLVDGUIYNXFHCETQ\n62 DHOXKZWVTCPBRMGIQALYJFUNES\n63 TJFPRHKUWQOMXNIBLYVDZEAGSC\n64 ACBZGTPNSJYDVLXRHOWKUEFMQI\n65 FPHEOKUXNQMZWIVRTCSGBDLJAY\n66 DJABIUXEYQOKRZNSLMPGCTVHFW\n67 AIHDGCNLPQOVTKMJFSRZEBUYXW\n68 JKULTOCZYWNDBIXHQMPSFGEARV\n69 BZJTGQCFKWRPODNLYMSEVHIUAX\n70 CQDBVGIZRNJKFLUXAWYTESPMOH\n71 TADSIQMURKNHYVXCELWOPZGFJB\n72 VSYUFWHJKOBNTIEDRXMLACZPGQ\n73 ILCBVHDKSURWXJNFAEYOPQMGZT\n74 WHVQOLDZPURMGEXTSFYBAICJKN\n75 EZKTAMWIYJQXPLOVBCHNGUDFRS\n76 VCLSBQWEDKGTYIFXHARMZUNPJO\n77 FYAJDGSOVPRCHQWUNITEBKZLMX\n78 BXQWVTCEURIZKAGPNLODFJHMYS\n79 MJPKITCUYZSXBOGLADEWVFQNHR\n80 IZEXRFDHAGSQNPTVBMLWKOUJCY\n81 CTPONKGRMUJWQEYXZVALHIDBFS\n82 HVFBTXSJLNAYPZUQOMRGWICKED\n83 UCSBJDZOTEIQHARVYNWLPMGKFX\n84 LUJHAXCWIRPMVDQNTGBZEFYOKS\n85 AHUKMVEPFNBXYCTORQDSIWZGJL\n86 XWLNYZGIAKJSURDHMQCETFVPBO\n87 VSIJNAXHZLPOQYGRDKMUWFBETC\n88 EMWOFAKYTNQZGXJPLVBRCIUDSH\n89 RSLIHTMPNJXGOCKDUQFAZYWVBE\n90 XCJIGNOKFEHMTADBYWPLSZRUQV\n91 AJCKXTMLDWHEZBNYORUIVGPSQF\n92 RZEWMCBXITNQLYADSOVGFUPHKJ\n93 JMSOVGIPCLYUNDRTFEWQBHXKZA\n94 FYCRPOJNHLSKVUBIDMXAEQZTGW\n95 UXZRBFIQNYLWDKCHSJTPAVEGMO\n96 SRJTMXUZBWGFYDKEVOPAHILQCN\n97 QOHEWVDSTAKJIBNXPGCLRYMZFU\n98 OKSGRZYCDEWVJPAHXFLIMUNBTQ\n99 ULDOMNSRCYGVBPXQWAZJFKEITH".split("\n");
        String[] cipherTextBlock = new String[5];
        String plainText = "THISCIPHERWASWIDELYUSEDBECAUSEOFSIMPLESTR";
        String[] plainTextBlock = new String[5];
        HashMap<String, Character> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            cipherTextBlock[i] = cipherText.substring(25 * i, 25 * (i + 1));
        }

        for (int i = 0; i < plainText.length(); i++) {
            map.put(cipherTextBlock[i / 25].charAt(i % 25) + String.valueOf(i % 25), plainText.charAt(i));
        }

        System.out.println("------cipherText------");
        for (String block : cipherTextBlock) {
            System.out.println("block = " + block);
        }
        System.out.println("------cipherText------");

        System.out.println("------plainText------");
        for (int i = 41; i < 125; i++) {
            if (map.containsKey(cipherTextBlock[i / 25].charAt(i % 25) + String.valueOf(i % 25))) {
                plainText += map.get(cipherTextBlock[i / 25].charAt(i % 25) + String.valueOf(i % 25));
            } else {
                plainText += "_";
            }
        }

        for (int i = 0; i < 5; i++) {
            plainTextBlock[i] = plainText.substring(25 * i, 25 * (i + 1));
        }

        for (String block : plainTextBlock) {
            System.out.println("block = " + block);
        }
        System.out.println("------plainText------");
        System.out.println("------find offset------");

        // offset은 6임을 알 수 있다.
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 100; j++) {
                String[] split = keys[j].split(" ");
                int a1 = split[1].indexOf(plainTextBlock[0].charAt(i));
                int b1 = split[1].indexOf(cipherTextBlock[0].charAt(i));
                if (a1 > b1) {
                    b1 += 26;
                }

                int a2 = split[1].indexOf(plainTextBlock[1].charAt(i));
                int b2 = split[1].indexOf(cipherTextBlock[1].charAt(i));
                if (a2 > b2) {
                    b2 += 26;
                }

                if (b1 - a1 == b2 - a2) {
                    System.out.print(split[0] + "," + (b1 - a1) + "||");
                }
            }
            System.out.println();
        }
        System.out.println("------find offset------");
        System.out.println("------find key------");
        int[] keyNum = new int[25];
        for (int i = 0; i < 25; i++) {
            keyNum[i] = -1;
        }
        keyNum[0] = 52;
        keyNum[1] = 19;
        keyNum[2] = 26;
        keyNum[4] = 2;
        keyNum[5] = 17;
        keyNum[6] = 49;
        keyNum[9] = 8;
        keyNum[10] = 94;
        keyNum[11] = 70;
        keyNum[12] = 92;
        keyNum[13] = 88;
        keyNum[14] = 27;
        keyNum[15] = 63;

        for (int i = 16; i < 25; i++) {
            for (int j = 0; j < 100; j++) {
                String[] split = keys[j].split(" ");
                int a = split[1].indexOf(plainTextBlock[0].charAt(i));
                int b = split[1].indexOf(cipherTextBlock[0].charAt(i));
                if (a > b) {
                    b += 26;
                }

                if (b - a == 6) {
                    System.out.print(split[0] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("------find key------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 25; j++) {
                if (keyNum[j] != -1 && plainTextBlock[i].charAt(j) == '_') {
                    char cipher = cipherTextBlock[i].charAt(j);
                    String[] split = keys[keyNum[j]].split(" ");
                    int index = split[1].indexOf(cipher);
                    int plainIndex = index - 6 < 0 ? index - 6 + 26 : index - 6;
                    plainTextBlock[i] = plainTextBlock[i].substring(0, j) + split[1].charAt(plainIndex) + plainTextBlock[i].substring(j + 1);
                }
            }
        }
        System.out.println("------plainText------");
        for (String block : plainTextBlock) {
            System.out.println("block = " + block);
        }
        System.out.println("------plainText------");

        System.out.println("------find 3th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[2].charAt(3);
            int a1 = split[1].indexOf('O');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[3].charAt(3);
            int a2 = split[1].indexOf('T');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }
            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 3th key------");

        System.out.println("------find 7th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher1 = cipherTextBlock[3].charAt(7);
            char cipher2 = cipherTextBlock[2].charAt(7);

            int a = split[1].indexOf('U');
            int b = split[1].indexOf(cipher1);
            if (a > b) {
                b += 26;
            }

            int c = split[1].indexOf('T');
            int d = split[1].indexOf(cipher2);
            if (c > d) {
                d += 26;
            }
            if (b - a == 6 && d - c == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 7th key------");

        System.out.println("------find 8th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[3].charAt(8);
            int a = split[1].indexOf('L');
            int b = split[1].indexOf(cipher);
            if (a > b) {
                b += 26;
            }
            if (b - a == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 8th key------");
        keyNum[3] = 28;
        keyNum[7] = 38;
        keyNum[8] = 87;

        System.out.println("\n" + "------find 16th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[1].charAt(16);
            int a1 = split[1].indexOf('U');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[2].charAt(16);
            int a2 = split[1].indexOf('I');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }
            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 16th key------");
        keyNum[16] = 39;

        System.out.println("\n" + "------find 17th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[1].charAt(17);
            int a1 = split[1].indexOf('C');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[2].charAt(17);
            int a2 = split[1].indexOf('T');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }
            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 17th key------");
        keyNum[17] = 35;

        System.out.println("\n" + "------find 18th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[1].charAt(18);
            int a1 = split[1].indexOf('T');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[0].charAt(18);
            int a2 = split[1].indexOf('Y');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 18th key------");
        keyNum[18] = 30;

        System.out.println("\n" + "------find 19th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[1].charAt(19);
            int a1 = split[1].indexOf('U');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            if (b1 - a1 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 19th key------");

        System.out.println("\n" + "------find 20th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[1].charAt(20);
            int a1 = split[1].indexOf('R');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[2].charAt(20);
            int a2 = split[1].indexOf('R');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            char cipher3 = cipherTextBlock[0].charAt(20);
            int a3 = split[1].indexOf('S');
            int b3 = split[1].indexOf(cipher3);
            if (a3 > b3) {
                b3 += 26;
            }

            char cipher4 = cipherTextBlock[4].charAt(20);
            int a4 = split[1].indexOf('N');
            int b4 = split[1].indexOf(cipher4);
            if (a4 > b4) {
                b4 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6 && b3 - a3 == 6 && b4 - a4 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 20th key------");

        System.out.println("\n" + "------find 21th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[0].charAt(21);
            int a1 = split[1].indexOf('E');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[4].charAt(21);
            int a2 = split[1].indexOf('T');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 21th key------");

        System.out.println("\n" + "------find 22th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[0].charAt(22);
            int a1 = split[1].indexOf('D');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[1].charAt(22);
            int a2 = split[1].indexOf('T');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 22th key------");

        System.out.println("\n" + "------find 23th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[0].charAt(23);
            int a1 = split[1].indexOf('B');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[1].charAt(23);
            int a2 = split[1].indexOf('H');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 23th key------");

        System.out.println("\n" + "------find 24th key------");
        for (int i = 0; i < 100; i++) {
            String[] split = keys[i].split(" ");
            char cipher = cipherTextBlock[0].charAt(24);
            int a1 = split[1].indexOf('E');
            int b1 = split[1].indexOf(cipher);
            if (a1 > b1) {
                b1 += 26;
            }

            char cipher2 = cipherTextBlock[4].charAt(24);
            int a2 = split[1].indexOf('T');
            int b2 = split[1].indexOf(cipher2);
            if (a2 > b2) {
                b2 += 26;
            }

            if (b1 - a1 == 6 && b2 - a2 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "------find 24th key------");

        keyNum[19] = 31;
        keyNum[22] = 34;
        keyNum[23] = 78;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 25; j++) {
                if (keyNum[j] != -1 && plainTextBlock[i].charAt(j) == '_') {
                    char cipher = cipherTextBlock[i].charAt(j);
                    String[] split = keys[keyNum[j]].split(" ");
                    int index = split[1].indexOf(cipher);
                    int plainIndex = index - 6 < 0 ? index - 6 + 26 : index - 6;
                    plainTextBlock[i] = plainTextBlock[i].substring(0, j) + split[1].charAt(plainIndex) + plainTextBlock[i].substring(j + 1);
                }
            }
        }

        System.out.println("------plainText------");

        for (String block : plainTextBlock) {
            System.out.println("block = " + block);
        }
        System.out.println("------plainText------");
        keyNum[20] = 5;
        keyNum[21] = 42;
        keyNum[24] = 60;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 25; j++) {
                if (keyNum[j] != -1 && plainTextBlock[i].charAt(j) == '_') {
                    char cipher = cipherTextBlock[i].charAt(j);
                    String[] split = keys[keyNum[j]].split(" ");
                    int index = split[1].indexOf(cipher);
                    int plainIndex = index - 6 < 0 ? index - 6 + 26 : index - 6;
                    plainTextBlock[i] = plainTextBlock[i].substring(0, j) + split[1].charAt(plainIndex) + plainTextBlock[i].substring(j + 1);
                }
            }
        }

        System.out.println("------plainText------");

        for (String block : plainTextBlock) {
            System.out.println("block = " + block);
        }
        System.out.println("------plainText------");
    }
}