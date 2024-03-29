package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
rendered	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Point	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
Raster	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
SoftReference	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
CleanerThread	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HaltingThread	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TileMap	TokenNameIdentifier
implements	TokenNameimplements
TileStore	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
DEBUG	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
COUNT	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
HashMap	TokenNameIdentifier
rasters	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
class	TokenNameclass
TileMapLRUMember	TokenNameIdentifier
extends	TokenNameextends
TileLRUMember	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Point	TokenNameIdentifier
pt	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SoftReference	TokenNameIdentifier
parent	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
RasterSoftRef	TokenNameIdentifier
extends	TokenNameextends
CleanerThread	TokenNameIdentifier
.	TokenNameDOT
SoftReferenceCleared	TokenNameIdentifier
{	TokenNameLBRACE
RasterSoftRef	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cleared	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Cleaned: "	TokenNameStringLiteral
+	TokenNamePLUS
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TileMap	TokenNameIdentifier
tm	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TileMap	TokenNameIdentifier
)	TokenNameRPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
tm	TokenNameIdentifier
.	TokenNameDOT
rasters	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
TileMapLRUMember	TokenNameIdentifier
(	TokenNameLPAREN
TileMap	TokenNameIdentifier
parent	TokenNameIdentifier
,	TokenNameCOMMA
Point	TokenNameIdentifier
pt	TokenNameIdentifier
,	TokenNameCOMMA
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
parent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SoftReference	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
pt	TokenNameIdentifier
=	TokenNameEQUAL
pt	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRaster	TokenNameIdentifier
(	TokenNameLPAREN
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
hRaster	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
wRaster	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RasterSoftRef	TokenNameIdentifier
(	TokenNameLPAREN
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
TileGenerator	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
LRUCache	TokenNameIdentifier
cache	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
TileMap	TokenNameIdentifier
(	TokenNameLPAREN
TileGenerator	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
LRUCache	TokenNameIdentifier
cache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
cache	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
source	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTile	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
,	TokenNameCOMMA
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Point	TokenNameIdentifier
pt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ras	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
rasters	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
cache	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
TileMapLRUMember	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
rasters	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TileMapLRUMember	TokenNameIdentifier
item	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
item	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TileMapLRUMember	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
pt	TokenNameIdentifier
,	TokenNameCOMMA
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rasters	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
,	TokenNameCOMMA
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
item	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TileMapLRUMember	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
item	TokenNameIdentifier
.	TokenNameDOT
setRaster	TokenNameIdentifier
(	TokenNameLPAREN
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Setting: ("	TokenNameStringLiteral
+	TokenNamePLUS
x	TokenNameIdentifier
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
y	TokenNameIdentifier
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Raster	TokenNameIdentifier
getTileNoCompute	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Point	TokenNameIdentifier
pt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
rasters	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
TileMapLRUMember	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TileMapLRUMember	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
Raster	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
item	TokenNameIdentifier
.	TokenNameDOT
retrieveRaster	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
cache	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Raster	TokenNameIdentifier
getTile	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Fetching: ("	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
COUNT	TokenNameIdentifier
)	TokenNameRPAREN
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
TileMap	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
requests	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Point	TokenNameIdentifier
pt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
rasters	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TileMapLRUMember	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
item	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TileMapLRUMember	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
ras	TokenNameIdentifier
=	TokenNameEQUAL
item	TokenNameIdentifier
.	TokenNameDOT
retrieveRaster	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ras	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Generating: ("	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
COUNT	TokenNameIdentifier
)	TokenNameRPAREN
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
TileMap	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
misses	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ras	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
genTile	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
HaltingThread	TokenNameIdentifier
.	TokenNameDOT
hasBeenHalted	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
item	TokenNameIdentifier
.	TokenNameDOT
setRaster	TokenNameIdentifier
(	TokenNameLPAREN
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
item	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TileMapLRUMember	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
pt	TokenNameIdentifier
,	TokenNameCOMMA
ras	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rasters	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
pt	TokenNameIdentifier
,	TokenNameCOMMA
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
int	TokenNameint
requests	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
misses	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
