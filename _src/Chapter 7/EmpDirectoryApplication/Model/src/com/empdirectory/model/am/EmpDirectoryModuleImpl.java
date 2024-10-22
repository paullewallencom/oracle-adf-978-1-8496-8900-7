package com.empdirectory.model.am;

import com.empdirectory.model.am.common.EmpDirectoryModule;
import com.empdirectory.model.view.DeptVOImpl;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 09 00:07:21 CDT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpDirectoryModuleImpl extends ApplicationModuleImpl implements EmpDirectoryModule {
    /**
     * This is the default constructor (do not remove).
     */
    public EmpDirectoryModuleImpl() {
    }

    /**
     * Container's getter for EmpVO1.
     * @return EmpVO1
     */
    public ViewObjectImpl getEmpVO1() {
        return (ViewObjectImpl)findViewObject("EmpVO1");
    }

    /**
     * Container's getter for DeptVO1.
     * @return DeptVO1
     */
    public DeptVOImpl getDeptVO1() {
        return (DeptVOImpl)findViewObject("DeptVO1");
    }

    /**
     * Container's getter for EmpVO3.
     * @return EmpVO3
     */
    public ViewObjectImpl getEmpVO3() {
        return (ViewObjectImpl)findViewObject("EmpVO3");
    }

    /**
     * Container's getter for EmpVOToDeptVOLink2.
     * @return EmpVOToDeptVOLink2
     */
    public ViewLinkImpl getEmpVOToDeptVOLink2() {
        return (ViewLinkImpl)findViewLink("EmpVOToDeptVOLink2");
    }

    public void beforeCommit(TransactionEvent transactionEvent) {
        ViewObject vo = findViewObject("EmpVO3");
        vo.clearCache();
        vo.executeQuery();
        super.beforeCommit(transactionEvent);
    }
    
    public String getHelloWorld(){
        return "Hello World";
    }
    
}
