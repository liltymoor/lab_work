
class GC:
    def __init__(self, current_dir: dict):
        self.namespace_init = current_dir
        self.snapshot = dict()

    def do_snapshot(self):
        self.snapshot = dict(self.namespace_init)

    def clear(self):
        difference = {k: self.namespace_init[k] for k in set(self.namespace_init) - set(self.snapshot)}
        for var in difference.keys():
            del self.namespace_init[var]
