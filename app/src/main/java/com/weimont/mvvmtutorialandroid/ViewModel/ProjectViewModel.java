package com.weimont.mvvmtutorialandroid.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.weimont.mvvmtutorialandroid.ProjectModel;
import com.weimont.mvvmtutorialandroid.Repository.AppRepo;

import java.util.List;

public class ProjectViewModel extends AndroidViewModel {

    private AppRepo appRepo;

    public ProjectViewModel(@NonNull Application application) {
        super(application);

        appRepo = AppRepo(application);
    }

    public void insertProject(ProjectModel projectModel){
        appRepo.insertProject(projectModel);
    }

    public void updateProject(ProjectModel projectModel){
        appRepo.updateProject(projectModel);
    }

    public void deleteProject(ProjectModel projectModel){
        appRepo.deleteProject(projectModel);
    }

    public List<ProjectModel> getAllProject(){
        return appRepo.getAllProject();
    }
}
