package com.kenant42.jsfstudies;

import jakarta.faces.event.*;

public class MyActionListener implements  ActionListener {

    @Override
    public void processAction(ActionEvent actionEvent) throws AbortProcessingException {

        actionEvent.getComponent().getAttributes();
        //Bileşene atanan özniteliklerin (attributes) bir koleksiyonunu döndürür. Bu öznitelikler, bileşenin kullanıcı tanımlı verilerini temsil eder.

        actionEvent.getComponent().getChildren();
        //Bileşenin alt bileşenlerinin bir listesini döndürür. Bu yöntemle, bir bileşenin içinde bulunan diğer bileşenlere erişebilirsiniz.

        actionEvent.getComponent().getClientId();
        //Bileşenin istemci tarafındaki benzersiz kimliğini (client ID) döndürür. Bu, bileşenin HTML çıktısındaki id özniteliği ile eşleşir.

        actionEvent.getComponent().getChildCount();
        //Bileşenin alt bileşenlerinin sayısını döndürür.

        actionEvent.getComponent().getParent();
        //Bileşenin üst (parent) bileşenini döndürür. Bu yöntemle, bir bileşenin üst hiyerarşisinde gezinebilirsiniz.

        actionEvent.getComponent().getFacets();
        //Bileşene atanmış olan yüzleri (facets) temsil eden bir koleksiyonu döndürür. Yüzler, bileşenin özel bölgelerinde başka bileşenler veya içerikler barındırmak için kullanılır.

        actionEvent.getComponent().getId();
        //Bileşenin kimliğini (ID) döndürür. Bu, bileşenin bileşen ağacındaki benzersiz kimliğini temsil eder.


        actionEvent.getSource();
        //Eylem olayının kaynağını (source) döndürür. Genellikle actionListener veya valueChangeListener olaylarında kullanılır ve olayı tetikleyen bileşeni temsil eder.


        actionEvent.getComponent().getFamily();
        //Bileşenin ailesini (family) döndürür. Bileşenler, belirli bir aileye ait olabilir ve bu, JSF bileşen kitaplıklarını ve davranışlarını tanımlar.

        actionEvent.getComponent().clearInitialState();
        //Bileşenin başlangıç durumunu (initial state) temizler. Bu yöntem genellikle Ajax istekleri sırasında kullanılır ve bileşenin iç durumunun güncellenmesini sağlar.


        PhaseId phaseId =  actionEvent.getPhaseId();
        actionEvent.setPhaseId(phaseId);

        actionEvent.getComponent().getFacetCount();

        actionEvent.getComponent().isInView();

        actionEvent.getComponent().isRendered();


    }

    public void onayVer(ActionEvent actionEvent){
        actionEvent.getComponent().getAttributes().get("inputname");
        actionEvent.getComponent().getAttributes().get("inputemail");
    }




}
