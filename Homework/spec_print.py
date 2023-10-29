
def spec_print(task_num: int, var_names: dict, *args):
    print()

    if not bool(var_names):
        var_names = {i:"SOLUTION" for i in range(len(args))}

    name_counter = 0
    for arg in args:
        print(f"[TASK №{task_num}] {var_names[name_counter]}: {arg}")
        name_counter += 1

    print()