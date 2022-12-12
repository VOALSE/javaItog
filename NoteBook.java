public class NoteBook {
// для информационной системой ветеринарной клиники
        int id;
        String firm;
        String model;
        int ramVolume;
        int hdVolume;
        String os;
        String color;



        public NoteBook(int id, String firm, String model, int ramVolume, int hdVolume, String os, String color) {
                this.id = id;
                this.firm = firm;
                this.model = model;
                this.ramVolume = ramVolume;
                this.hdVolume = hdVolume;
                this.os = os;
                this.color = color;
        }

        public static StringBuilder getColor(NoteBook[] nb, String color){
                StringBuilder result = new StringBuilder();
                int i = 1;
                for (NoteBook c: nb) {
                        if (c.color==color){
                                result.append(i+ ". " + c.firm + " " + c.model + " RAM:" + c.ramVolume + " HDD:" + c.hdVolume + " " + c.os + " " + c.color);
                                result.append("\n");
                                i += 1;
                        }
                }
                return result;
        }

        public static StringBuilder getOS(NoteBook[] nb, String os){
                StringBuilder result = new StringBuilder();
                int i = 1;
                for (NoteBook c: nb) {
                        if (c.os==os){
                                result.append(i+ ". " + c.firm + " " + c.model + " RAM:" + c.ramVolume + " HDD:" + c.hdVolume + " " + c.os + " " + c.color);
                                result.append("\n");
                                i += 1;
                        }
                }
                return result;
        }

        public static StringBuilder getHDD(NoteBook[] nb, Integer hddMin, Integer hddMax){
                StringBuilder result = new StringBuilder();
                int i = 1;
                for (NoteBook c: nb) {
                        if (c.hdVolume >= hddMin && c.hdVolume <= hddMax){
                                result.append(i+ ". " + c.firm + " " + c.model + " RAM:" + c.ramVolume + " HDD:" + c.hdVolume + " " + c.os + " " + c.color);
                                result.append("\n");
                                i += 1;
                        }
                }
                return result;
        }

}
