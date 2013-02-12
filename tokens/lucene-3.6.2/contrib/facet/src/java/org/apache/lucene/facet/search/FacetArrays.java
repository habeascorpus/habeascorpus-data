package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FacetArrays	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
intArray	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
floatArray	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IntArrayAllocator	TokenNameIdentifier
intArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
FloatArrayAllocator	TokenNameIdentifier
floatArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
arraysLength	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FacetArrays	TokenNameIdentifier
(	TokenNameLPAREN
IntArrayAllocator	TokenNameIdentifier
intArrayAllocator	TokenNameIdentifier
,	TokenNameCOMMA
FloatArrayAllocator	TokenNameIdentifier
floatArrayAllocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
intArrayAllocator	TokenNameIdentifier
=	TokenNameEQUAL
intArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
floatArrayAllocator	TokenNameIdentifier
=	TokenNameEQUAL
floatArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
free	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
intArrayAllocator	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
intArrayAllocator	TokenNameIdentifier
.	TokenNameDOT
free	TokenNameIdentifier
(	TokenNameLPAREN
intArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
intArray	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
floatArrayAllocator	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
floatArrayAllocator	TokenNameIdentifier
.	TokenNameDOT
free	TokenNameIdentifier
(	TokenNameLPAREN
floatArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
floatArray	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
arraysLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getIntArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
intArray	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
intArray	TokenNameIdentifier
=	TokenNameEQUAL
intArrayAllocator	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
arraysLength	TokenNameIdentifier
=	TokenNameEQUAL
intArray	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
intArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getFloatArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
floatArray	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
floatArray	TokenNameIdentifier
=	TokenNameEQUAL
floatArrayAllocator	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
arraysLength	TokenNameIdentifier
=	TokenNameEQUAL
floatArray	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
floatArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getArraysLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
arraysLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
