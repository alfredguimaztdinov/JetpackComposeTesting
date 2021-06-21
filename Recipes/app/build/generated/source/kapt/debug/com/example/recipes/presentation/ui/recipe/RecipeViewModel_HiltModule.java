package com.example.recipes.presentation.ui.recipe;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = RecipeViewModel.class
)
public interface RecipeViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.recipes.presentation.ui.recipe.RecipeViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(RecipeViewModel_AssistedFactory factory);
}
