package gHost.promocarouselapi.response;

import gHost.promocarouselapi.model.UserModule;

public class UserModuleResponse {

    private String moduleName;
    private Integer moduleOrder;


    public UserModuleResponse(String moduleName) {
        this.moduleName = moduleName;
    }

    public UserModuleResponse() {}

    public UserModuleResponse(UserModule userModule) {
        this.moduleName = userModule.getModule().getName();
        this.moduleOrder = userModule.getModuleOrder();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }
}
