package com.empdirectory.model.view;

import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 09 00:03:45 CDT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeptVORowImpl extends ViewRowImpl {
    public static final int ENTITY_DEPTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Deptno {
            public Object get(DeptVORowImpl obj) {
                return obj.getDeptno();
            }

            public void put(DeptVORowImpl obj, Object value) {
                obj.setDeptno((Integer)value);
            }
        }
        ,
        Dname {
            public Object get(DeptVORowImpl obj) {
                return obj.getDname();
            }

            public void put(DeptVORowImpl obj, Object value) {
                obj.setDname((String)value);
            }
        }
        ,
        Loc {
            public Object get(DeptVORowImpl obj) {
                return obj.getLoc();
            }

            public void put(DeptVORowImpl obj, Object value) {
                obj.setLoc((String)value);
            }
        }
        ,
        EmpVO {
            public Object get(DeptVORowImpl obj) {
                return obj.getEmpVO();
            }

            public void put(DeptVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DeptVORowImpl object);

        public abstract void put(DeptVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int DEPTNO = AttributesEnum.Deptno.index();
    public static final int DNAME = AttributesEnum.Dname.index();
    public static final int LOC = AttributesEnum.Loc.index();
    public static final int EMPVO = AttributesEnum.EmpVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DeptVORowImpl() {
    }

    /**
     * Gets DeptEO entity object.
     * @return the DeptEO
     */
    public EntityImpl getDeptEO() {
        return (EntityImpl)getEntity(ENTITY_DEPTEO);
    }

    /**
     * Gets the attribute value for DEPTNO using the alias name Deptno.
     * @return the DEPTNO
     */
    public Integer getDeptno() {
        return (Integer) getAttributeInternal(DEPTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPTNO using the alias name Deptno.
     * @param value value to set the DEPTNO
     */
    public void setDeptno(Integer value) {
        setAttributeInternal(DEPTNO, value);
    }

    /**
     * Gets the attribute value for DNAME using the alias name Dname.
     * @return the DNAME
     */
    public String getDname() {
        return (String) getAttributeInternal(DNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DNAME using the alias name Dname.
     * @param value value to set the DNAME
     */
    public void setDname(String value) {
        setAttributeInternal(DNAME, value);
    }

    /**
     * Gets the attribute value for LOC using the alias name Loc.
     * @return the LOC
     */
    public String getLoc() {
        return (String) getAttributeInternal(LOC);
    }

    /**
     * Sets <code>value</code> as attribute value for LOC using the alias name Loc.
     * @param value value to set the LOC
     */
    public void setLoc(String value) {
        setAttributeInternal(LOC, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmpVO.
     */
    public RowIterator getEmpVO() {
        return (RowIterator)getAttributeInternal(EMPVO);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
