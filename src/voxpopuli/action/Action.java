package voxpopuli.action;
public enum Action
{
  TASK("org.eclipse.mylyn.tasks.ui.command.openTask", "eclipse open task"),  
  BACK_TO("org.eclipse.ui.navigate.backwardHistory", "eclipse backward"),  
  FORWARD_TO("org.eclipse.ui.navigate.forwardHistory", "eclipse forward"),  
  LAST_EDIT_LOCATION("org.eclipse.ui.edit.text.gotoLastEditPosition", "eclipse go to last edit"),  
  OPEN_TYPE("org.eclipse.jdt.ui.navigate.open.type", "eclipse open type"),  
  SEARCH("org.eclipse.search.ui.openSearchDialog", "eclipse search"),  
  SKIP_ALL_BREAK_POINTS("org.eclipse.debug.ui.commands.SkipAllBreakpoints", "eclipse skip breakpoints"),  
  GETTER_SETTER("org.eclipse.jdt.ui.edit.text.java.create.getter.setter", "eclipse insert getter setter"),  
  HASHCODE_EQUALS("org.eclipse.jdt.ui.edit.text.java.generate.hashcode.equals", "eclipse insert hash"),  
  TO_STRING("org.eclipse.jdt.ui.edit.text.java.generate.tostring", "eclipse insert string"),  
  CONSTRUCTOR("org.eclipse.jdt.ui.edit.text.java.generate.constructor.using.fields", "eclipse insert consructor"),  
  FORMAT("org.eclipse.jdt.ui.edit.text.java.format", "eclipse source format"),  
  STEP_INTO("org.eclipse.debug.ui.commands.StepInto", "eclipse step into"),  
  STEP_OVER("org.eclipse.debug.ui.commands.StepOver", "eclipse step over"),  
  RUN_TO_LINE("org.eclipse.debug.ui.commands.RunToLine", "eclipse run to line"),  
  TERMINATE("org.eclipse.debug.ui.actions.Terminate", "eclipse terminate"),  
  RESUME("org.eclipse.debug.ui.actions.Resume", "eclipse resume"),  
  REBUILD("org.eclipse.jdt.ui.index.rebuild", "eclipse rebuild"),  
  NEW("org.eclipse.ui.newWizard", "eclipse new"),  
  SAVE("org.eclipse.ui.file.save", "eclipse save"),  
  RENAME("org.eclipse.ui.edit.rename", "eclipse rename"),  
  REFRESH("org.eclipse.ui.file.refresh", "eclipse refresh"),  
  UNDO("org.eclipse.ui.edit.undo", "eclipse undo"),  
  CUT("org.eclipse.ui.edit.cut", "eclipse cut"),  
  COPY("org.eclipse.ui.edit.copy", "eclipse copy"),  
  PASTE("org.eclipse.ui.edit.paste", "eclipse paste"),  
  SELECT_ALL("org.eclipse.ui.edit.selectAll", "eclipse select all"),  
  DELETE("org.eclipse.ui.edit.delete", "eclipse delete"),  
  CLOSE("org.eclipse.ui.file.close", "eclipse close"),  
  OPEN_WORKSPACE("org.eclipse.ui.file.openWorkspace", "eclipse open workspace"),  
  STOP_PLUGIN("stop plugin", "eclipse stop listening"),
  
  FILE_NEW("org.eclipse.ui.newWizard", "eclipse file new"),
  FILE_CLOSE("org.eclipse.ui.file.close", "eclipse file close"),
  FILE_CLOSE_ALL("org.eclipse.ui.file.closeAll", "eclipse file close all"),
  FILE_IMPORT("org.eclipse.ui.file.import", "eclipse file import"),
  FILE_EXPORT("org.eclipse.ui.file.export", "eclipse file export"),
  FILE_SAVE("org.eclipse.ui.file.save", "eclipse file save"),
  FILE_SAVE_AS("org.eclipse.ui.file.saveAs", "eclipse file save as"),
  FILE_SAVE_ALL("org.eclipse.ui.file.saveAll", "eclipse file save all"),
  FILE_PRINT("org.eclipse.ui.file.print", "eclipse file print"),
  FILE_REVERT("org.eclipse.ui.file.revert", "eclipse file revert"),

  FILE_RESTART("org.eclipse.ui.file.restartWorkbench", "eclipse file restart workbench"),
  FILE_REFRESH("org.eclipse.ui.file.refresh", "eclipse file refresh"), 
  FILE_PROPERTIES("org.eclipse.ui.file.properties", "eclipse file properties"),
  FILE_EXIT("org.eclipse.ui.file.exit", "eclipse file exit"),
  FILE_MOVE("org.eclipse.ui.edit.move", "eclipse file move"),
  FILE_RENAME("org.eclipse.ui.edit.rename", "eclipse file rename"),
  FILE_CLOSE_OTHERS("org.eclipse.ui.file.closeOthers", "eclipse file close others"), 
  EDIT_UNDO("org.eclipse.ui.edit.undo", "eclipse edit undo"),
  EDIT_REDO("org.eclipse.ui.edit.redo", "eclipse edit redo"),
  EDIT_CUT("org.eclipse.ui.edit.cut", "eclipse edit cut"),
  EDIT_COPY("org.eclipse.ui.edit.copy", "eclipse edit copy"),
  EDIT_PASTE("org.eclipse.ui.edit.paste", "eclipse edit paste"),
  EDIT_DELETE("org.eclipse.ui.edit.delete", "eclipse edit delete"),
  EDIT_CONTENT_ASSIST("org.eclipse.ui.edit.text.contentAssist.proposals", "eclipse edit content assist"),
  EDIT_CONTEXT_INFORMATION("org.eclipse.ui.edit.text.contentAssist.contextInformation", "eclipse edit context information"),
  EDIT_SELECT_ALL("org.eclipse.ui.edit.selectAll", "eclipse edit select all"),
  EDIT_FIND_AND_REPLACE("org.eclipse.ui.edit.findReplace", "eclipse edit find and replace"),
  EDIT_ADD_TASK("org.eclipse.ui.edit.addTask", "eclipse edit add task"),
  EDIT_ADD_BOOKMARK("org.eclipse.ui.edit.addBookmark", "eclipse edit add bookmark"),
  NAVIGATE_GO_INTO("org.eclipse.ui.navigate.goInto", "eclipse navigate go into"),
  NAVIGATE_BACK("org.eclipse.ui.navigate.back", "eclipse navigate back"),
  NAVIGATE_FORWARD("org.eclipse.ui.navigate.forward", "eclipse navigate forward"),
  NAVIGATE_UP("org.eclipse.ui.navigate.up", "eclipse navigate up"),
  NAVIGATE_NEXT("org.eclipse.ui.navigate.next", "eclipse navigate next"),
  NAVIGATE_BACKWARD_HISTORY("org.eclipse.ui.navigate.backwardHistory", "eclipse navigate backward history"),
  NAVIGATE_FORWARD_HISTORY("org.eclipse.ui.navigate.forwardHistory", "eclipse navigate forward history"),
  NAVIGATE_PREVIOUS("org.eclipse.ui.navigate.previous", "eclipse navigate previous"),
  NAVIGATE_TOGGLE_LINK_WITH_EDITOR("org.eclipse.ui.navigate.linkWithEditor", "eclipse navigate toggle link with editor"),
  NAVIGATE_NEXT_PAGE("org.eclipse.ui.part.nextPage", "eclipse navigate next page"),
  NAVIGATE_PREVIOUS_PAGE("org.eclipse.ui.part.previousPage", "eclipse previous page"),
  NAVIGATE_COLLAPSE_ALL("org.eclipse.ui.navigate.collapseAll", "eclipse navigate collapse all"),
  NAVIGATE_EXPAND_ALL("org.eclipse.ui.navigate.expandAll", "eclipse expand all"),
  NAVIGATE_SHOW_IN("org.eclipse.ui.navigate.showIn", "eclipse navigate show in"),
  NAVIGATE_SHOW_IN_PARM_TARGET("org.eclipse.ui.navigate.showIn.targetId", "eclipse navigate show in parm target"),
  NAVIGATE_SHOW_IN_QUICK_MENU("org.eclipse.ui.navigate.showInQuickMenu", "eclipse navigate show in quick menu"),
  PROJECT_BUILD_ALL("org.eclipse.ui.project.buildAll", "eclipse project build all"),
  PROJECT_BUILD_PROJECT("org.eclipse.ui.project.buildProject", "eclipse build project"),
  PROJECT_CLOSE_PROJECT("org.eclipse.ui.project.closeProject", "eclipse close project"),
  PROJECT_CLOSE_UNRELATED_PROJECTS("org.eclipse.ui.project.closeUnrelatedProjects", "eclipse close unrelated projects"),
  PROJECT_OPEN_PROJECT("org.eclipse.ui.project.openProject", "eclipse open project"),
  WINDOW_NEW_WINDOW("org.eclipse.ui.window.newWindow", "eclipse new window"),
  WINDOW_NEW_EDITOR("org.eclipse.ui.window.newEditor", "eclipse new editor"),
  WINDOW_ACTIVATE_EDITOR("org.eclipse.ui.window.activateEditor", "eclipse activate editor"),
  WINDOW_MAXIMIZE_ACTIVE_VIEW_OR_EDITOR("org.eclipse.ui.window.maximizePart", "eclipse maximize active view or editor"),
  WINDOW_MINIMIZE_ACTIVE_VIEW_OR_EDITOR("org.eclipse.ui.window.minimizePart", "eclipse minimize active view or editor"),
  WINDOW_NEXT_EDITOR("org.eclipse.ui.window.nextEditor", "eclipse next editor"),
  WINDOW_PREVIOUS_EDITOR("org.eclipse.ui.window.previousEditor", "eclipse previous editor"),
  WINDOW_NEXT_VIEW("org.eclipse.ui.window.nextView", "eclipse next view"),
  WINDOW_PREVIOUS_VIEW("org.eclipse.ui.window.previousView", "eclipse previous view"),
  WINDOW_NEXT_PERSPECTIVE("org.eclipse.ui.window.nextPerspective", "eclipse next perspective"),
  WINDOW_PREVIOUS_PERSPECTIVE("org.eclipse.ui.window.previousPerspective", "eclipse previous perspective"),
  WINDOW_CLOSE_ALL_PERSPECTIVES("org.eclipse.ui.window.closeAllPerspectives", "eclipse close all perspectives"),
  WINDOW_CLOSE_PERSPECTIVE("org.eclipse.ui.window.closePerspective", "eclipse close perspective"),
  WINDOW_CLOSE_PERSPECTIVE_PARM_ID("org.eclipse.ui.window.closePerspective.perspectiveId", "eclipse close perspective parm id"),
  WINDOW_CLOSE_PART("org.eclipse.ui.file.closePart", "eclipse close part"),
  WINDOW_CUSTOMIZE_PERSPECTIVE("org.eclipse.ui.window.customizePerspective", "eclipse customize perspective"),
  WINDOW_PIN_EDITOR("org.eclipse.ui.window.pinEditor", "eclipse pin editor"),
  WINDOW_PREFERENCES("org.eclipse.ui.window.preferences", "eclipse preferences"),
  WINDOW_RESET_PERSPECTIVE("org.eclipse.ui.window.resetPerspective", "eclipse reset perspective"),
  WINDOW_SAVE_PERSPECTIVE_AS("org.eclipse.ui.window.savePerspective", "eclipse save perspective as"),
  WINDOW_SHOW_KEY_ASSIST("org.eclipse.ui.window.showKeyAssist", "eclipse show key assist"),
  WINDOW_LOCK_TOOLBAR("org.eclipse.ui.window.lockToolBar", "eclipse lock toolbar"),
  HELP_HELP_CONTENTS("org.eclipse.ui.help.helpContents", "eclipse help contents"),
  HELP_HELP_SEARCH("org.eclipse.ui.help.helpSearch", "eclipse help search"),
  HELP_DYNAMIC_HELP("org.eclipse.ui.help.dynamicHelp", "eclipse dynamic help"),
  HELP_WELCOME("org.eclipse.ui.help.quickStartAction", "eclipse help welcome"),
  HELP_TIPS_AND_TRICKS("org.eclipse.ui.help.tipsAndTricksAction", "eclipse help tips and tricks"),
  HELP_ABOUT("org.eclipse.ui.help.aboutAction", "eclipse help about"),
  VIEWS_SHOW_VIEW("org.eclipse.ui.views.showView", "eclipse show view"),
//  VIEWS_SHOW_VIEW_PARM_ID("org.eclipse.ui.views.showView.viewId", "eclipse show view parm id"),
//  VIEWS_SHOW_VIEW_SECONDARY_ID("org.eclipse.ui.views.showView.secondaryId", "eclipse show view secondary id"),
//  VIEWS_SHOW_VIEW_PARM_FASTVIEW("org.eclipse.ui.views.showView.makeFast", "eclipse show view parm fastview"),
  PERSPECTIVES_SHOW_PERSPECTIVE("org.eclipse.ui.perspectives.showPerspective", "eclipse show perspective"),
//  PERSPECTIVES_SHOW_PERSPECTIVE_PARM_ID("org.eclipse.ui.perspectives.showPerspective.perspectiveId", "eclipse show perspective parm id"),
//  PERSPECTIVES_SHOW_PERSPECTIVE_PARM_NEWWINDOW("org.eclipse.ui.perspectives.showPerspective.newWindow", "eclipse show perspective parm new window"),  
  
//  ORGANIZE_IMPORTS("org.eclipse.jdt.ui.edit.text.java.organize.imports","eclipse organize imports"),
//  ORGANIZE_IMPORTS("org.eclipse.jdt.ui.actions.OrganizeImportsAction","eclipse organize imports"),
  ALREADY_STARTED("plugin already started", "");
  
  private String eclipseId;
  private String actionId;
  
  private Action(String eclipseId, String actionId)
  {
    this.eclipseId = eclipseId;
    this.actionId = actionId;
  }
  
  public String getEclipseId()
  {
    return this.eclipseId;
  }
  
  public String getActionId()
  {
    return this.actionId;
  }
  
  public String formatCommand()
  {
    StringBuilder sb = new StringBuilder();
    sb.append(name());
    sb.append(": ");
    sb.append(this.eclipseId);
    return sb.toString();
  }
  
  public String toString()
  {
    return formatCommand();
  }
}