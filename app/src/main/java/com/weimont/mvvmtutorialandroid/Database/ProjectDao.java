package com.weimont.mvvmtutorialandroid.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.weimont.mvvmtutorialandroid.ProjectModel;

import java.util.List;

@Dao
public interface ProjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    int insertProject(ProjectModel projectModel);

    @Update
    int updateProject(ProjectModel projectModel);

    @Delete
    int deleteProject(ProjectModel projectModel);

    @Query("SELECT * FROM project")
    List<ProjectModel> getAllProjects();

    //@Query("SELECT p_title, watcher, issues, language, pId FROM project WHERE pId=:id")
    //ProjectModel getProject(int id);

    @Query("SELECT * FROM project WHERE pId=:id")
    ProjectModel getProject(int id);

    //@Delete
    //List<int> deleteListOfObjects(List<ProjectModel> projectModelList);
}
