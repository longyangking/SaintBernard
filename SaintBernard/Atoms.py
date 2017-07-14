import numpy as np

class Atoms:
    def __init__(self,
            symbols=None,
            positions=None,
            numbers=None,
            masses=None,
            magmoms=None,
            scaled_positions=None,
            cell=None,
            pbc=None):

    def set_cell(self,cell):

    def get_cell(self):

    def set_positions(self,cart_positions):

    def get_positions(self):

    def set_scaled_positions(self,scaled_positions):

    def get_scaled_positions(self):

    def set_masses(self,masses):

    def get_masses(self):

    def set_magnetic_moments(self,magmoms):

    def get_magnetic_moments(self):

    def set_chemical_symbols(self,symbols):

    def get_chemical_symbols(self):

    def get_number_of_atoms(self):

    def get_atomic_numbers(self):

    def get__volume(self):

    def copy(self):

    def _number_to_symbols(self):

    def _symbols_to_numbers(self):

    def _symbols_to_masses(self):

atom_data = []

symbol_map = {}