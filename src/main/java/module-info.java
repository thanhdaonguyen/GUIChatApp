module daofe.chatsss {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires org.kordamp.bootstrapfx.core;

  opens daofe.chatsss to javafx.fxml;
  exports daofe.chatsss;
}