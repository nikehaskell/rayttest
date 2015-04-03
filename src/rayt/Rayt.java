/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rayt;

/**
 *
 * @author HASNIKE
 */
public class Rayt {

    /**
     * @param args the command line arguments
     */
    String[][] EighteenPlus;
    public Rayt(){
       this.EighteenPlus = new String[24][2];
       this.EighteenPlus[0][0] = "Побуждает ли ваше приложение к совершению действий, представляющих угрозу жизни или здоровью, в том числе к причинению вреда своему здоровью, самоубийству?";
       this.EighteenPlus[1][0] = "Сделан ли акцент на употребление и продажу алкоголя, табачных изделий и наркотиков?";
       this.EighteenPlus[2][0] ="Сделан ли акцент на участие в азартных играх?";
       this.EighteenPlus[3][0] ="Способно ли вызвать желание заниматься проституцией, бродяжничеством или попрошайничеством?";
       this.EighteenPlus[4][0] ="Обосновывает или оправдывает допустимость насилия или жестокости?";
       this.EighteenPlus[5][0] ="Побуждает осуществлять насильственные действия по отношению к людям или животным?";
       this.EighteenPlus[6][0] ="Отрицаются ли семейные ценности?";
       this.EighteenPlus[7][0] ="Пропагандируются ли нетрадиционные сексуальные отношения?";
       this.EighteenPlus[8][0] ="Формирует ли неуважение к членам семьи?";
       this.EighteenPlus[9][0] ="Оправдывается ли противоправное действие?";
       this.EighteenPlus[10][0] ="Содержится ли нецензурная брань или информация порнографического характера?";
       this.EighteenPlus[11][0] ="Содержится ли информация, позволяющая прямо или косвенно установить личность несовершеннолетнего, пострадавшего в результате противоправных действий или бездействий?";
       this.EighteenPlus[12][0] ="Содержатся ли изображение или описание жестокости или насилия без показа процесса лишения жизни или нанесения увечий с выражением сострадания к жертве и отрицательное отношение к жестокости и насилию?";
       this.EighteenPlus[13][0] ="Содержатся ли изображение или описание несчастного случая, аварии, катастрофы, заболевания, смерти без показа последствий, которые могут вызвать страх, ужас или панику?";
       this.EighteenPlus[14][0] ="Содержится ли информация о наркотических веществах без их демонстрации или об опасных последствиях их потребления с демонстрацией таких случаев при условии, что осуждается отношение к потреблению таких средств и содержится указание на их опасность?";
       this.EighteenPlus[15][0] ="Содержатся ли бранные слова или выражения не относящиеся к нецензурной брани?";
       this.EighteenPlus[16][0] ="Содержатся ли материалы, не эксплуатирующие интерес к сексу и не носящие оскорбительного характера изображение или описание половых отношений между мужчиной и женщиной, за исключением изображения или описания действий сексуального характера?";
       this.EighteenPlus[17][0] ="Содержатся ли эпизодические изображение или описание жестокости или насилия без показа процесса лишения жизни или нанесения увечий с выражением сострадания к жертве и отрицательное отношение к жестокости и насилию?";
       this.EighteenPlus[18][0] ="Материалы содержат изображение или описание, на побуждающие к совершению антиобщественных действий (в том числе к потреблению алкогольной продукции, участию в азартных играх, занятию проституцией, бродяжничеством или попрошайничеством), эпизодическое упоминание без демонстрации наркотических средств при условии, что не оправдывается допустимость антиобщественных действий, выражается отрицательное отношение к ним и содержится указание на опасность потребления указанных средств, веществ и т.д.?";
       this.EighteenPlus[19][0] ="Материалы не эксплуатируют интерес к сексу и не носят возбуждающего или оскорбительного характера эпизодические ненатуралистические изображение или описание половых отношений между мужчиной и женщиной за исключением изображения или описания действий сексуального характера?";
       this.EighteenPlus[20][0] ="Содержатся ли ненатуралистические изображения или описание несчастного случая, аварии, катастрофы либо ненасильственной смерти без демонстрации их последствий, которые могут вызывать у детей страх, ужас или панику?";
       this.EighteenPlus[21][0] ="Содержатся ли кратковременные и ненатуралистические изображение или описание заболеваний человека (за исключением тяжелых заболеваний) и (или) их последствий в форме, не унижающей человеческого достоинства?";
       this.EighteenPlus[22][0] ="Содержатся ли материалы, не побуждающие к совершению антиобщественных действий и (или) преступлений эпизодические изображение или описание этих действий и (или) преступлений при условии, что не обосновывается и не оправдывается их допустимость и выражается отрицательное, осуждающее отношение к лицам, их совершающим.";
       this.EighteenPlus[23][0] ="Содержится ли информация, не причиняющая вреда здоровью и (или) развитию детей (в том числе информационная продукция, содержащая оправданные ее жанром и (или) сюжетом эпизодические ненатуралистические изображение или описание физического и (или) психического насилия (за исключением сексуального насилия) при условии торжества добра над злом и выражения сострадания к жертве насилия и (или) осуждения насилия)?";
       for(int i=0;i<12;i++){
           if (i<5){
               this.EighteenPlus[i+12][1] = "16+";
               if (i<3){
                  this.EighteenPlus[i+17][1] = "12+"; 
                  this.EighteenPlus[i+20][1] = "6+";
                  if (i==0){
                      this.EighteenPlus[i+23][1] = "0+";
                  }
               }
           }
           this.EighteenPlus[i][1] = "18+";
       }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NewJFrame.main(args);
    }
}
