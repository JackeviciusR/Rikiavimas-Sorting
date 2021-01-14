/*
 * 
 */
package rikiavimas;

/**
 *
 * @author Rokas
 */
public class Rikiavimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int rikiavimoAlgoritmas = 2; // 0 - isrinkimo, 1 - burbulo
        
        // kaip isrikiuosime masyvo argumentus
        int arRikiuojameDidejimoTvarka = 1; // 1 - taip, 0 - ne
        
        
        int[] masyvas = {5,2,-7,0,6,-1,0,2};
        
        
        String[] txtRikiavimoAlgoritmas = {"Isrinkimo", "Burbulo", "Iterpimo"};
        String txtRikiavimoTvarka = arRikiuojameDidejimoTvarka == 1 ? "didejimo tvarka:" : "mazejimo tvarka:";
       
        
        // ---< Isrinkimo rikiavimo algoritmas start >--
        if (rikiavimoAlgoritmas == 0) {
            
            for (int i = 0; i < masyvas.length; i++) {
                int minMax = masyvas[i];

                if (arRikiuojameDidejimoTvarka == 1) {

                    for (int j = i; j < masyvas.length; j++) {

                        if (minMax > masyvas[j]) {
                            int tarpinis = minMax;
                            minMax = masyvas[j];
                            masyvas[j] = tarpinis;
                        }
                    }
                }


                if (arRikiuojameDidejimoTvarka == 0) {

                    for (int j = i; j < masyvas.length; j++) {

                        if (minMax < masyvas[j]) {
                            int tarpinis = minMax;
                            minMax = masyvas[j];
                            masyvas[j] = tarpinis;
                        }
                    }
                }

                masyvas[i] = minMax;

            }
            
        }
        
        // ---< Isrinkimo rikiavimo algoritmas end >--
        
           
        // ---< Burbolo rikiavimo algoritmas start >--

        if (rikiavimoAlgoritmas == 1) {
        
            boolean arTesti = true;

            while (arTesti == true) {

                arTesti = false;

                for (int i = 0; i < (masyvas.length - 1); i++) {

                    if (arRikiuojameDidejimoTvarka == 1) {
                    
                        if (masyvas[i] > masyvas[i + 1]) {
                            int tarpinis = masyvas[i];
                            masyvas[i] = masyvas[i + 1];
                            masyvas[i + 1] = tarpinis;

                            arTesti = true;
                        }
                        
                    }
                    
                    if (arRikiuojameDidejimoTvarka == 0) {
                    
                        if (masyvas[i] < masyvas[i + 1]) {
                            int tarpinis = masyvas[i];
                            masyvas[i] = masyvas[i + 1];
                            masyvas[i + 1] = tarpinis;

                            arTesti = true;
                        }
                        
                    }
                    
                }

            }
        
        }
        
        // ---< Burbolo rikiavimo algoritmas end >--
        
        
        // ---< Iterpimo rikiavimo algoritmas start >--
        
        if (rikiavimoAlgoritmas == 2) {
            
            if (arRikiuojameDidejimoTvarka == 1) {
            
                for (int i = 0; i < (masyvas.length - 1); i++) {

                    if (masyvas[i] > masyvas[i+1]) {

                        int j = i;
                        int perstumiamas = masyvas[i+1];

                        boolean arTesti = true;

                        while (arTesti) {

                            masyvas[j+1] = masyvas[j];

                            if (j > 0) {

                                if (masyvas[j-1] <= perstumiamas) {
                                    masyvas[j] = perstumiamas;
                                    arTesti = false;

                                }

                                j--;

                            } else {

                                masyvas[j] = perstumiamas;
                                arTesti = false;
                            }

                        }

                    }

                }
            }
            
            
            if (arRikiuojameDidejimoTvarka == 0) {
            
                for (int i = 0; i < (masyvas.length - 1); i++) {

                    if (masyvas[i] < masyvas[i+1]) {

                        int j = i;
                        int perstumiamas = masyvas[i+1];

                        boolean arTesti = true;

                        while (arTesti) {

                            masyvas[j+1] = masyvas[j];

                            if (j > 0) {

                                if (masyvas[j-1] >= perstumiamas) {
                                    masyvas[j] = perstumiamas;
                                    arTesti = false;

                                }

                                j--;

                            } else {

                                masyvas[j] = perstumiamas;
                                arTesti = false;
                            }

                        }

                    }

                }
            }
        
        }
        // ---< Iterpimo rikiavimo algoritmas end >--
        
        
        
        // SPAUSDINIMAS
        System.out.println("\nNaudotas " + txtRikiavimoAlgoritmas[rikiavimoAlgoritmas] + " rikiavimo aloritmas");
        System.out.println("isrikiuota " + txtRikiavimoTvarka);
        
        for (int k : masyvas) {
            System.out.print(k + " ");
        }
        
        System.out.println("");
        
    }
    
}
