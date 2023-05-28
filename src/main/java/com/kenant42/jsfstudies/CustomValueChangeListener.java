package com.kenant42.jsfstudies;

import jakarta.faces.application.*;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import jakarta.faces.event.*;
import lombok.var;

import java.awt.*;
import java.util.List;
import java.util.Locale;

public class CustomValueChangeListener implements ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        valueChangeEvent.getNewValue();
        //Değer değişikliği olayında yeni değeri döndürür. Önceki değeri temsil eden özelliği yeni değerle güncellemek için kullanılabilir.
        valueChangeEvent.getOldValue();
        //Değer değişikliği olayında önceki değeri döndürür. Yeni değeri temsil eden özelliği önceki değerle karşılaştırmak veya geri alma işlemleri yapmak için kullanılabilir.
        valueChangeEvent.getPhaseId();
        //Değer değişikliği olayının aşama kimliğini döndürür. JSF'nin yaşam döngüsündeki hangi aşamada değer değişikliği olayının gerçekleştiğini belirtir.

        valueChangeEvent.getSource();
        //eğer değişikliği olayının kaynağını (source) döndürür. Genellikle valueChangeListener olaylarında kullanılır ve olayı tetikleyen bileşeni temsil eder.


        valueChangeEvent.getFacesContext().getMessageList();
//        Yüzlerce özgü JSF mesajını içeren bir liste döndürür. Bu mesajlar, genellikle doğrulama hataları veya işlem sonuçları gibi bilgilendirme mesajlarını içerir.

        valueChangeEvent.getFacesContext().getCurrentPhaseId();
        //Şu anda işlenen aşama kimliğini döndürür. Bu, JSF'nin yaşam döngüsünde hangi aşamada olduğunuzu belirtir.

        valueChangeEvent.getFacesContext().getMessages();
        //Şu anda işlenen aşama kimliğini döndürür. Bu, JSF'nin yaşam döngüsünde hangi aşamada olduğunuzu belirtir.

        valueChangeEvent.getFacesContext().getAttributes();
        //Yüzlerce JSF özniteliğini içeren bir harita döndürür. Bu öznitelikler, JSF bileşenlerinin, yüzlerin ve diğer nesnelerin kullanıcı tanımlı verilerini temsil eder.

        valueChangeEvent.getFacesContext().getExceptionHandler();
        //Bir ExceptionHandler nesnesini döndürür. Bu, JSF'deki özel hata işleme durumlarını ele almak için kullanılabilir.

        valueChangeEvent.getFacesContext().getExternalContext();
        //ExternalContext nesnesini döndürür. Bu, JSF uygulamasının dış etkileşimlerini yönetmek için kullanılır, örneğin istemci taleplerini almak veya dosyalara erişmek gibi.

        valueChangeEvent.getFacesContext().validationFailed();
        //oğrulama işleminde hata olup olmadığını kontrol eder. Eğer doğrulama işlemi başarısız olursa true, aksi takdirde false döndürür.

    }

    public void facesMessage(){
        FacesMessage facesMessage = new FacesMessage();
        facesMessage.getDetail();
        facesMessage.getSeverity();
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        facesMessage.isRendered();
        facesMessage.getSummary();


        FacesContext facesContext =  FacesContext.getCurrentInstance();
        facesContext.addMessage("Hata meydana geldei",facesMessage);
        facesContext.getMessages();



        List<FacesMessage> messageList = facesContext.getMessageList();
        for (FacesMessage message : messageList) {
            // Mesaj işlemleri
            String summary = message.getSummary();
            String detail = message.getDetail();
            FacesMessage.Severity severity = message.getSeverity();
        }


    }

   Object facesContext = FacesContext.getCurrentInstance().getExternalContext()
            .getSessionMap().get("personelname");

    Object componentTypes = FacesContext.getCurrentInstance().getApplication().getComponentTypes();
    ActionListener actionListener = FacesContext.getCurrentInstance().getApplication().getActionListener();

    Object converterIds = FacesContext.getCurrentInstance().getApplication().getConverterIds();

    Object behaviorIds = FacesContext.getCurrentInstance().getApplication().getBehaviorIds();

    Object validatorIds = FacesContext.getCurrentInstance().getApplication().getValidatorIds();

    Object converterTypes = FacesContext.getCurrentInstance().getApplication().getConverterTypes();



    String country = FacesContext.getCurrentInstance().getApplication().getDefaultLocale().getCountry();
    String displayLanguage  = FacesContext.getCurrentInstance().getApplication().getDefaultLocale().getDisplayLanguage();
    boolean hasExtensions = FacesContext.getCurrentInstance().getApplication().getDefaultLocale().hasExtensions();

    Object script = FacesContext.getCurrentInstance().getApplication().getDefaultLocale().getScript();
    String messageBundle = FacesContext.getCurrentInstance().getApplication().getMessageBundle();
    //Mesaj kaynağı (message bundle) dosyasının adını döndürür.
    NavigationHandler navigationHandler = FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
    ViewHandler viewHandler = FacesContext.getCurrentInstance().getApplication().getViewHandler();

    ResourceHandler resourceHandler = FacesContext.getCurrentInstance().getApplication().getResourceHandler();

    Object supportedLocales = FacesContext.getCurrentInstance().getApplication().getSupportedLocales();


    FacesMessage.Severity maximumSeverity = FacesContext.getCurrentInstance().getMaximumSeverity();

    String authType = FacesContext.getCurrentInstance().getExternalContext().getAuthType();
    Object session = FacesContext.getCurrentInstance().getExternalContext().getSession(true);

    ResponseWriter responseWriter = FacesContext.getCurrentInstance().getResponseWriter();
    String getAuthType = FacesContext.getCurrentInstance().getResponseWriter().getContentType();
    String characterEncoding = FacesContext.getCurrentInstance().getResponseWriter().getCharacterEncoding();

    Object clientIdsWithMessages = FacesContext.getCurrentInstance().getClientIdsWithMessages();

    String viewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
    String family = FacesContext.getCurrentInstance().getViewRoot().getFamily();
    String uniqueId = FacesContext.getCurrentInstance().getViewRoot().createUniqueId();

    Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

    Object viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();

    boolean isInView = FacesContext.getCurrentInstance().getViewRoot().isInView();

    List<PhaseListener> phaseListenerList = FacesContext.getCurrentInstance().getViewRoot().getPhaseListeners();

    boolean validationFailed = FacesContext.getCurrentInstance().isValidationFailed();

    boolean isPostback = FacesContext.getCurrentInstance().isPostback();
    //İsteğin bir PostBack isteği olup olmadığını kontrol eder.
    //Bir web formunda kullanıcı, formdaki alanları doldurur ve "Submit" veya "Gönder" gibi bir düğmeye tıklar.
    // Bu düğmeye tıkladıktan sonra tarayıcı, form verilerini sunucuya gönderir. Sunucu, bu verileri alır, işler ve bir yanıt üretir.
    //PostBack, tam olarak bu süreci ifade eder.
    //PostBack işlemi, sayfanın tamamını yeniden yüklemeyi gerektirir.


    boolean isResponseCompleted = FacesContext.getCurrentInstance().getResponseComplete();
    //mevcut web isteğinin yanıtının tamamlanıp tamamlanmadığını kontrol etmek için kullanılır.

    Object contextPath  = FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath();
    //getExternalContext() metodu, FacesContext nesnesinin dış bağlamını temsil eden bir ExternalContext nesnesini döndürür.
    //getApplicationContextPath() metodu, ExternalContext nesnesinin uygulama bağlamının (application context) yolunu (path) döndürür.
    // Uygulama bağlamı, web uygulamasının kök dizinidir ve uygulamanın tüm kaynaklarının temel yolunu belirtir.


    Object context = FacesContext.getCurrentInstance().getExternalContext().getContext();
    //getContext() metodu, ExternalContext nesnesinin genel bağlamını (context) döndürür.
    // Genel bağlam, web uygulamasının yürütme ortamının (execution environment) sağladığı hizmetlere erişim sağlayan bir nesnedir.

    Object a = FacesContext.getCurrentInstance().getRenderResponse();
    //mevcut web isteğinin yanıtın render edilip edilmediğini kontrol etmeye yönelik bilgiye erişimi sağlar.









}
