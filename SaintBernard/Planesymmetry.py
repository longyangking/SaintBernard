import numpy as np 

class SaintBernardError(object):
    pass

def get_version():
    pass

def get_symmetry(cell, symprec=1e-5, angle_tolerance=-1.0):

def get_symmetry_dataset(cell, 
                        symprec=1e-5,
                        angle_tolerance=-1.0,
                        hall_number=0):

def get_spacegroup(cell,
                    symprec=1e-5,
                    angle_tolerance=-1.0,
                    symbol_type=0):

def get_hall_number_from_symmetry(rotations,
                                translations,
                                symprec=1e-5):

def get_spacegroup_type(hall_number):

def get_pointgroup(rotations):

def standardize_cell(cell,
                    to_primitive=False,
                    no_idealize=False,
                    symprec=1e-5,
                    angle_tolerance=-1.0):

def refine_cell(cell,symprec=1e-5,angle_tolerance=-1.0):

def find_primitive(cell,symprec=1e-5,angle_tolerance=-1.0):

def get_symmetry_from_database(hall_number):

def get_grid_point_from_address(grid_address,mesh):

def get_ir_reciprocal_mesh(mesh,
                        cell,
                        is_shift=None,
                        is_time_reversal=True,
                        symprec=1e-5):

def get_stabilized_reciprocal_mesh(mesh,
                        rotations,
                        is_shift=None,
                        is_time_reversal=True,
                        qpoints=None):

def get_grid_points_by_rotations(address_orig,
                        reciprocal_rotations,
                        mesh,
                        is_shift=np.zeros(3,dtype='intc')):

def get_BZ_grid_points_by_rotations(address_orig,
                        reciprocal_rotations,
                        mesh,
                        bz_map,
                        is_shift=np.zeros(3,dtype='intc')):

def relocate_BZ_grid_address(grid_address,
                        mesh,
                        reciprocal_lattice,
                        is_shift=np.zeros(3,dtype='intc')):

def delaunay_reduce(lattice,eps=1e-5):

def niggli_reduce(lattice,eps=1e-5):

def get_error_message():

def _expand_cell(cell):

def _check(lattice,positions,numbers,magmoms):

def _set_error_message():

def _set_no_error():