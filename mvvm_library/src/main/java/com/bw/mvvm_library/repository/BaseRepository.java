package com.bw.mvvm_library.repository;



import com.bw.mvvm_library.common.MVVMModelException;
import com.bw.mvvm_library.model.Model;

import java.lang.reflect.Field;


public abstract class BaseRepository {
    public BaseRepository() {
        injectModel();
    }

    private void injectModel() {
        Class<? extends BaseRepository> aClass = this.getClass();
        Field[] fields = aClass.getDeclaredFields();
        if (fields==null||fields.length==0){
            throw new MVVMModelException("no have any fields info...");
        }
        boolean flag=false;
        for (Field field:fields){
            Model annotation = field.getAnnotation(Model.class);
            if (null!=annotation){
                flag=true;
                field.setAccessible(true);
                String fieldClassName = field.getType().getName();
                try {
                    Class<?> fieldClazz = Class.forName(fieldClassName);
                    Object fieldInstance = fieldClazz.newInstance();
                    field.set(this,fieldInstance);
                } catch (ClassNotFoundException e) {
                    throw new MVVMModelException(e.getMessage());
                } catch (IllegalAccessException e) {
                    throw new MVVMModelException(e.getMessage());
                } catch (InstantiationException e) {
                    throw new MVVMModelException(e.getMessage());
                }

            }
        }
        if (!flag){
            throw new MVVMModelException("no set any model.....");
        }
    }
}
