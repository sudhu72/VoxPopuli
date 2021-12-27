package voxpopuli.action;
import java.util.Optional;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ActionManager
{
    private static List<ActionListener> listeners;
    private static List<Action> actions;
    
    static {
        ActionManager.listeners = new ArrayList<ActionListener>();
        //ActionManager.actions = new ArrayList<Action>();
        ActionManager.actions = Arrays.asList(Action.values());
    }
    
    public static void addListener(final ActionListener listener) {
        ActionManager.listeners.add(listener);
    }
    
    public static void notify(final Action action) {
        ActionManager.listeners.stream().forEach(el -> el.action(action));
    }
    
    public static void findActionAndNotify(final String actionId) {
    	System.out.println("findActionAndNotify: "+actionId);
        final Optional<Action> action = ActionManager.actions.stream().filter(el -> el.getActionId().equals(actionId)).findFirst();
        if (action.isPresent()) {
            ActionManager.listeners.stream().forEach(el -> el.action(action.get()));
        }
    }
}