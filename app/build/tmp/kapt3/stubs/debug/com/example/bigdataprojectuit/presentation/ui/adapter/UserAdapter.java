package com.example.bigdataprojectuit.presentation.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0017J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bigdataprojectuit/presentation/ui/adapter/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/bigdataprojectuit/presentation/ui/adapter/UserAdapter$UserViewHolder;", "users", "", "Lcom/example/bigdataprojectuit/domain/model/User;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UserViewHolder", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.bigdataprojectuit.presentation.ui.adapter.UserAdapter.UserViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.bigdataprojectuit.domain.model.User> users = null;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.bigdataprojectuit.domain.model.User> users) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.bigdataprojectuit.presentation.ui.adapter.UserAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.presentation.ui.adapter.UserAdapter.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bigdataprojectuit/presentation/ui/adapter/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/bigdataprojectuit/databinding/ItemUserBinding;", "(Lcom/example/bigdataprojectuit/presentation/ui/adapter/UserAdapter;Lcom/example/bigdataprojectuit/databinding/ItemUserBinding;)V", "getBinding", "()Lcom/example/bigdataprojectuit/databinding/ItemUserBinding;", "app_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.bigdataprojectuit.databinding.ItemUserBinding binding = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull
        com.example.bigdataprojectuit.databinding.ItemUserBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.bigdataprojectuit.databinding.ItemUserBinding getBinding() {
            return null;
        }
    }
}